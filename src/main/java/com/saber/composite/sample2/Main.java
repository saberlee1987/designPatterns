package com.saber.composite.sample2;

import javax.crypto.Cipher;
import javax.crypto.SealedObject;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

//6063 7312 0974 0878
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream)
        ) {
            Person person = new Person();
            person.setFirstName("saber66");
            person.setLastName("Azizi");
            KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
            generator.initialize(2048);
            KeyPair pair = generator.generateKeyPair();
            PrivateKey privateKey = pair.getPrivate();
            PublicKey publicKey = pair.getPublic();
            Cipher encryptCipher = Cipher.getInstance("RSA");
            encryptCipher.init(Cipher.ENCRYPT_MODE, publicKey);
            SealedObject sealedObject = new SealedObject(person,encryptCipher);
            outputStream.writeObject(sealedObject);
            System.out.println(byteArrayOutputStream.toString(StandardCharsets.UTF_8));
            ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
            SealedObject o = (SealedObject) objectInputStream.readObject();
            System.out.println(o);
            Cipher  decryptCipher= Cipher.getInstance("RSA");
            decryptCipher.init(Cipher.DECRYPT_MODE, privateKey);
            Object object = o.getObject(decryptCipher);
            System.out.println(object);
            } catch (Exception e) {
            e.printStackTrace();
        }
    }
}