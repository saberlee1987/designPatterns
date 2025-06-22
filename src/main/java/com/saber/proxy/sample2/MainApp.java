package com.saber.proxy.sample2;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("sample 2 proxy ....");
        Account account = new SecureBankAccount(1486);
        account.deposit(1250);
        account.withDraw(560);
        System.out.println("$"+account.getBalance());
    }
}
