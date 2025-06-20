package com.saber.bridge.sample1;

public class MysqlDataBase implements DataBase {
    private final MySqlDataBaseConnector mySqlDataBaseConnector;

    public MysqlDataBase(MySqlDataBaseConnector mySqlDataBaseConnector) {
        this.mySqlDataBaseConnector = mySqlDataBaseConnector;
    }

    @Override
    public void connect(String url, String username, String password) {
        mySqlDataBaseConnector.connect(url,username,password);
    }

    @Override
    public void executeQuery(String query) {
        mySqlDataBaseConnector.executeQuery(query);
    }

    @Override
    public void disconnect() {
        mySqlDataBaseConnector.disconnect();
    }
}