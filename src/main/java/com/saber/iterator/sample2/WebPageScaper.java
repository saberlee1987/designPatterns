package com.saber.iterator.sample2;

import java.util.Iterator;

public class WebPageScaper implements Iterable<String>{

    private final String url;

    public WebPageScaper(String url) {
        this.url = url;
    }
    @Override
    public Iterator<String> iterator() {
        return new WebPageIterator(this.url);
    }
}
