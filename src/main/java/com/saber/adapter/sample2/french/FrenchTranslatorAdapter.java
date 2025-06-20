package com.saber.adapter.sample2.french;

import com.saber.adapter.sample2.language.LanguageTranslator;

public class FrenchTranslatorAdapter implements LanguageTranslator {

    private final FrenchTranslator frenchTranslator;

    public FrenchTranslatorAdapter(FrenchTranslator frenchTranslator) {
        this.frenchTranslator = frenchTranslator;
    }

    @Override
    public String translate(String text) {
        return frenchTranslator.translateEnglishToFrench(text);
    }
}
