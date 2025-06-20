package com.saber.bridge.sample1;

public class OracleDataBaseConnector implements DataBaseConnector {
    @Override
    public void connect(String url, String username, String password) {
        System.out.println("connected to oracle database");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("oracle : execute : "+query);
    }

    @Override
    public void disconnect() {
        System.out.println("disconnected from oracle database");
    }
}
