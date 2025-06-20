package com.saber.bridge.sample1;

public interface DataBaseConnector {
    void connect(String url, String username, String password);

    void executeQuery(String query);

    void disconnect();
}
