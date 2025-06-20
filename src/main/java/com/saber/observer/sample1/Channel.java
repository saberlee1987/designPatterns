package com.saber.observer.sample1;

public interface Channel {
    void subscribe(Subscriber subscriber);
    void unSubscribe(Subscriber subscriber);
    void notifySubScribes(String video);
}
