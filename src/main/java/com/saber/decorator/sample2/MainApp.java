package com.saber.decorator.sample2;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Sample 2 decorator .....");
        WebServer webServer = new WebServer();
        RequestHandler requestHandler =
                new LoggingMiddleware(
                        new AuthenticationMiddleware(
                                new LoggingMiddleware(webServer)
                        ));
        requestHandler.handleRequest("https://google.com");
    }
}
