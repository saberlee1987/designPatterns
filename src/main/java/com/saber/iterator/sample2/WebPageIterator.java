package com.saber.iterator.sample2;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.Iterator;

public class WebPageIterator implements Iterator<String> {
    private final Elements links;
    private int currentPosition;

    public WebPageIterator(String url) {
         try {
            Document elements = Jsoup.connect(url).get();
            links = elements.select("a[href]");
            currentPosition  = 0;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean hasNext() {
        return currentPosition < links.size();
    }

    @Override
    public String next() {
        Element element = links.get(currentPosition);
        currentPosition++;
        return element.attr("href");
    }
}
