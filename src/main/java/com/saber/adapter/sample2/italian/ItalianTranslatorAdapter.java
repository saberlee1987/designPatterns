package com.saber.adapter.sample2.italian;

import com.saber.adapter.sample2.language.LanguageTranslator;

public class ItalianTranslatorAdapter implements LanguageTranslator {

    private final ItalianTranslator italianTranslator;

    public ItalianTranslatorAdapter(ItalianTranslator italianTranslator) {
        this.italianTranslator = italianTranslator;
    }

    @Override
    public String translate(String text) {
        return italianTranslator.translateEnglishToItalian(text);
    }
}
