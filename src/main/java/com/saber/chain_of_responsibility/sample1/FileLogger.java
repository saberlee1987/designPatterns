package com.saber.chain_of_responsibility.sample1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileLogger extends Logger{
    public FileLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    public void writeMessage(String message) {
        try {
            System.out.println("file write message ==> "+message);
            message = message.concat("\r\n");
            Files.write(Path.of("log.txt"),message.getBytes()
                    , StandardOpenOption.CREATE,StandardOpenOption.APPEND,StandardOpenOption.WRITE);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
