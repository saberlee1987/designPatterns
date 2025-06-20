package com.saber.decorator.sample2;

public class AuthenticationMiddleware extends MiddlewareDecorator {
    public AuthenticationMiddleware(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handleRequest(String request) {
        authenticateRequest(request);
        super.handleRequest(request);
    }

    private void authenticateRequest(String request) {
        System.out.println("handle authenticate middleware....");
    }
}
