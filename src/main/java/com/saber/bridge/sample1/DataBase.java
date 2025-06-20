package com.saber.bridge.sample1;

public interface DataBase {
    void connect(String url, String username, String password);

    void executeQuery(String query);

    void disconnect();
}
