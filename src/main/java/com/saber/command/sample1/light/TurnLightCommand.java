package com.saber.command.sample1.light;

import com.saber.command.sample1.command.Command;

public class TurnLightCommand implements Command {

    private final Light light;

    public TurnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnLight();
    }
}
