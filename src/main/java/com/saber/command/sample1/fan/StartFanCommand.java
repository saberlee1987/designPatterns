package com.saber.command.sample1.fan;

import com.saber.command.sample1.command.Command;

public class StartFanCommand implements Command {

    private final Fan fan;

    public StartFanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.startFan();
    }
}
