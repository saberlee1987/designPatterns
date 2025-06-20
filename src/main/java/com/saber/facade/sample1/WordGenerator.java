package com.saber.facade.sample1;

public class WordGenerator {
    private static WordGenerator wordGenerator;
    public static WordGenerator getInstance() {
        if (wordGenerator == null)
            wordGenerator = new WordGenerator();
        return wordGenerator;
    }
    private WordGenerator(){}
    public void generate(String content) {
        System.out.println("generate word file");
    }
}
