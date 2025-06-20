package com.saber.iterator.sample1;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public List<String> executeQuery(String sqlQuery) {
        System.out.println("sql query " + sqlQuery + " is execute ");

        List<String> result = new ArrayList<>();
        result.add("""
                {
                "id" : 1000 ,
                "firstName" : "saber",
                "lastName" : "azizi",
                "age" : 37
                }
                """);
        result.add("""
                {
                "id" : 1100 ,
                "firstName" : "bruce",
                "lastName" : "lee",
                "age" : 33
                }
                """);
        result.add("""
                {
                "id" : 1200 ,
                "firstName" : "jackie",
                "lastName" : "chan",
                "age" : 70
                }
                """);

        result.add("""
                {
                "id" : 1300 ,
                "firstName" : "jet",
                "lastName" : "li",
                "age" : 61
                }
                """);
        result.add("""
                {
                "id" : 1400 ,
                "firstName" : "ali",
                "lastName" : "yaghobi",
                "age" : 29
                }
                """);

        return result;
    }
}
