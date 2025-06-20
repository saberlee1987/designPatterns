package com.saber.observer.sample1;

import java.util.HashSet;
import java.util.Set;

public class YoutubeChannel implements Channel {

    private final String channelName;
    private final Set<Subscriber> subscribers;

    public YoutubeChannel(String channelName) {
        this.channelName = channelName;
        this.subscribers = new HashSet<>();
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        System.out.println(subscriber.getUserName()+" subscribe in youtubeChannel");
        this.subscribers.add(subscriber);
    }

    @Override
    public void unSubscribe(Subscriber subscriber) {
        System.out.println(subscriber.getUserName()+" unSubscribe from youtubeChannel");
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notifySubScribes(String video) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(channelName, video);
        }
    }
}
