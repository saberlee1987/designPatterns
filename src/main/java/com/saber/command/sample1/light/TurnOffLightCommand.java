package com.saber.command.sample1.light;

import com.saber.command.sample1.command.Command;

public class TurnOffLightCommand implements Command {

    private final Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOffLight();
    }
}
