package com.saber.adapter.sample2.persian;

import com.saber.adapter.sample2.language.LanguageTranslator;

public class PersianTranslatorAdapter implements LanguageTranslator {

    private final PersianTranslator persianTranslator;


    public PersianTranslatorAdapter(PersianTranslator persianTranslator) {
        this.persianTranslator = persianTranslator;
    }

    @Override
    public String translate(String text) {
        return persianTranslator.translateEnglishToPersian(text);
    }
}
