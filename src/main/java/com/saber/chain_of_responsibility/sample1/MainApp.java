package com.saber.chain_of_responsibility.sample1;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("sample 1 chain of responsibility");
        var logger = getLogger();
        logger.logg(LogLevel.ERROR,"this is an Error message");
        logger.logg(LogLevel.WARNING,"this is an Warning message");
        logger.logg(LogLevel.INFO,"this is an Info message");
    }

    private static Logger getLogger() {
        var errorLogger = new DBLogger(LogLevel.ERROR);
        var warningLogger = new FileLogger(LogLevel.WARNING);
        var infoLogger = new ConsoleLogger(LogLevel.INFO);

        errorLogger.setNextLogger(warningLogger);
        warningLogger.setNextLogger(infoLogger);
        return errorLogger;
    }
}
