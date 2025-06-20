package com.saber.oracle.sample1.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainApp {
    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        //testConnectToOracleDataBase();
    }

    private static void testConnectToOracleDataBase() {
        try (Connection connection = DriverManager.getConnection(
                "https://livesql.oracle.com/ords/f?p=590:1000"
                , "saberaziziz66@yahoo.com"
                , "Saber@Bruce@1987");
             Statement statement = connection.createStatement()) {
              ResultSet resultSet = statement.executeQuery("select * from hr.jobs");
            while (resultSet.next()) {
                System.out.print("JOB_ID ==> " + resultSet.getString("JOB_ID").concat("\t"));
                System.out.println("JOB_TITLE ==> " + resultSet.getString("JOB_TITLE"));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
