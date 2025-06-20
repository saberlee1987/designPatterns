package com.saber.decorator.sample2;

public class LoggingMiddleware extends MiddlewareDecorator {
    public LoggingMiddleware(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handleRequest(String request) {
        loggingRequest(request);
        super.handleRequest(request);
    }

    private void loggingRequest(String request) {
        System.out.println("handle logging middleware....");
    }
}
