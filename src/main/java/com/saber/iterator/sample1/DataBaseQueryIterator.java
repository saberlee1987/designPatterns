package com.saber.iterator.sample1;

import java.util.Iterator;

public class DataBaseQueryIterator implements QueryIterator {

    private final Iterator<String> iterator;

    public DataBaseQueryIterator(Iterable<String> iterable) {
        this.iterator = iterable.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public String next() {
        return iterator.next();
    }
}
