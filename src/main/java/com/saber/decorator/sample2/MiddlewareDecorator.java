package com.saber.decorator.sample2;

public abstract class MiddlewareDecorator  implements RequestHandler{
    private final RequestHandler requestHandler;

    public MiddlewareDecorator(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    @Override
    public void handleRequest(String request) {
        requestHandler.handleRequest(request);
    }
}
