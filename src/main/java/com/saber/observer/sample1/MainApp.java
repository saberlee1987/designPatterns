package com.saber.observer.sample1;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("sample 1 observer .....");
        Channel saber66Developer  =new YoutubeChannel("saber66Developer");

        Subscriber subscriber1 = new UserSubscriber("saber");
        Subscriber subscriber2 = new UserSubscriber("ali");
        Subscriber subscriber3 = new UserSubscriber("bruce");
        Subscriber subscriber4 = new UserSubscriber("jackie");
        saber66Developer.subscribe(subscriber1);
        saber66Developer.subscribe(subscriber2);
        saber66Developer.subscribe(subscriber3);
        saber66Developer.subscribe(subscriber4);
        String newVideo = "javaEE6.mp4";

        saber66Developer.notifySubScribes(newVideo);
        saber66Developer.unSubscribe(subscriber1);
    }
}
