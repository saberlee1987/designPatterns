package com.saber.facade.sample1;
//KRLA931V339514920
///  83PK229K
/// 1656645444

// IR 32018 0000000 177009845205  29
//6037 7015 8309 6554 2
public class MainApp {
    public static void main(String[] args) {
        String content = "Hello from Design Pattern";
      DocumentGenerator documentGenerator = new DocumentGenerator();
      documentGenerator.generateFile(DocumentType.PDF,content);
      documentGenerator.generateFile(DocumentType.EXCEL,content);
      documentGenerator.generateFile(DocumentType.WORD,content);
    }
}