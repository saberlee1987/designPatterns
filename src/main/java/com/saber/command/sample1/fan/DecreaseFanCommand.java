package com.saber.command.sample1.fan;

import com.saber.command.sample1.command.Command;

public class DecreaseFanCommand implements Command {

    private final Fan fan;

    public DecreaseFanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.deCreaseSpeedFan();
    }
}
