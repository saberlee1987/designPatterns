package com.saber.observer.sample1;

public interface Subscriber {
    String getUserName();
    void update(String channel,String video);
}
