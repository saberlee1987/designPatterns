package com.saber.iterator.sample2;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("sample 2 iterator");
        String url = "https://holosen.net/design-pattern/";
        WebPageScaper scaper = new WebPageScaper(url);
        for (String link : scaper) {
            System.out.println(link);
        }
    }
}
