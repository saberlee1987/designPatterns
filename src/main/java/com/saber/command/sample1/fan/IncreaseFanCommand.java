package com.saber.command.sample1.fan;

import com.saber.command.sample1.command.Command;

public class IncreaseFanCommand implements Command {

    private final Fan fan;

    public IncreaseFanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.increaseSpeedFan();
    }
}
