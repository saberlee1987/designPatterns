package com.saber.bridge.sample1;

public class MainApp {
    public static void main(String[] args) {
        MysqlDataBase mysqlDataBase = new MysqlDataBase(
                new MySqlDataBaseConnector()
        );
        mysqlDataBase.connect("jdbc:mysql//localhost:3306/test"
                , "saber66", "AdminSaber66");
        mysqlDataBase.executeQuery("select * from users");
        mysqlDataBase.disconnect();
        System.out.println("===============================================");

        OracleDataBase oracleDataBase = new OracleDataBase(
                new OracleDataBaseConnector()
        );
        oracleDataBase.connect("jdbc:oracle:thin@localhost:1521/orcl"
                , "saber66", "AdminSaber66");
        oracleDataBase.executeQuery("select * from persons");
        oracleDataBase.disconnect();

    }
}
