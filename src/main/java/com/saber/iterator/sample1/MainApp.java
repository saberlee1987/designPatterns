package com.saber.iterator.sample1;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("sample 1 iterator ....");
        DataBaseClient dataBaseClient = new DataBaseClient(new DataBase());

        QueryIterator queryIterator = dataBaseClient.executeQuery("select * from persons");
        String result;
        while (queryIterator.hasNext()) {
            result = queryIterator.next();
            System.out.println("query result ===> " + result);
        }

    }
}
