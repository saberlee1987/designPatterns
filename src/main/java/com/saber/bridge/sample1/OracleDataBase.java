package com.saber.bridge.sample1;

public class OracleDataBase implements DataBase {
    private final OracleDataBaseConnector oracleDataBaseConnector;

    public OracleDataBase(OracleDataBaseConnector oracleDataBaseConnector) {
        this.oracleDataBaseConnector = oracleDataBaseConnector;
    }

    @Override
    public void connect(String url, String username, String password) {
        oracleDataBaseConnector.connect(url,username,password);
    }

    @Override
    public void executeQuery(String query) {
        oracleDataBaseConnector.executeQuery(query);
    }

    @Override
    public void disconnect() {
        oracleDataBaseConnector.disconnect();
    }
}