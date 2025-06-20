package com.saber.command.sample1.fan;

import com.saber.command.sample1.command.Command;

public class StopFanCommand implements Command {

    private final Fan fan;

    public StopFanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.stopFan();
    }
}
