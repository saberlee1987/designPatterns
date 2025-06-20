package com.saber.command.sample2;

import java.util.ArrayDeque;
import java.util.Queue;

public class Customer {
    private final Queue<CarCommand> commands;

    public Customer() {
        this.commands = new ArrayDeque<>();
    }

    public void rentCar(CarCommand command) {
        commands.add(command);
    }

    public void returnCar(CarCommand command) {
        commands.add(command);
    }
    public void processCommands(){
        CarCommand command;
        while (!commands.isEmpty()) {
            command = commands.poll();
            command.execute();
        }
    }
}
