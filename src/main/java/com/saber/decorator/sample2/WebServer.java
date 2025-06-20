package com.saber.decorator.sample2;

public class WebServer implements RequestHandler {
    @Override
    public void handleRequest(String request) {
        System.out.println("handling the request ===> " + request);
    }
}
