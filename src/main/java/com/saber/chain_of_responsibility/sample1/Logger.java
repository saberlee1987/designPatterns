package com.saber.chain_of_responsibility.sample1;

import lombok.Setter;

@Setter
public abstract class Logger {
    private final LogLevel logLevel;
    private Logger nextLogger;

    public Logger(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public void logg(LogLevel logLevel, String message) {
        if (this.logLevel.ordinal() <= logLevel.ordinal()) {
            writeMessage(message);
        }
        if (nextLogger != null) {
            nextLogger.logg(logLevel, message);
        }
    }

    public abstract void writeMessage(String message);
}