package com.saber.bridge.sample1;

public class MySqlDataBaseConnector implements DataBaseConnector {
    @Override
    public void connect(String url, String username, String password) {
        System.out.println("connected to mysql database");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("mysql ==> execute : "+query);
    }

    @Override
    public void disconnect() {
        System.out.println("disconnected from mysql database");
    }
}
