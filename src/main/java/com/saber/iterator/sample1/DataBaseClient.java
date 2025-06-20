package com.saber.iterator.sample1;

import java.util.List;

public class DataBaseClient {
    private final DataBase dataBase;

    public DataBaseClient(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public QueryIterator executeQuery(String sqlQuery) {
        List<String> result = dataBase.executeQuery(sqlQuery);
        return new DataBaseQueryIterator(result);
    }
}
