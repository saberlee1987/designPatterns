package com.saber.adapter.sample2.main;

import com.saber.adapter.sample2.language.LanguageTranslator;
import com.saber.adapter.sample2.persian.PersianTranslator;
import com.saber.adapter.sample2.persian.PersianTranslatorAdapter;

public class MainApp {
    public static void main(String[] args) {
        LanguageTranslator translator = new PersianTranslatorAdapter(new PersianTranslator());
        String translate = translator.translate("book");
        System.out.println(translate);
    }
}
