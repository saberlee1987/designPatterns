package com.saber.chain_of_responsibility.sample1;

public class ConsoleLogger extends Logger{
    public ConsoleLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    public void writeMessage(String message) {
        System.out.println("console : message ==> "+message);
    }
}
