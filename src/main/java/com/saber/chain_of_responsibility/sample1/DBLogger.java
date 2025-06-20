package com.saber.chain_of_responsibility.sample1;

public class DBLogger extends Logger{
    public DBLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    public void writeMessage(String message) {
        System.out.println("db : message ==> "+message);
    }
}
