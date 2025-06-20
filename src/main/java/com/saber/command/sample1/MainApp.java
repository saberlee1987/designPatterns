package com.saber.command.sample1;

import com.saber.command.sample1.fan.*;
import com.saber.command.sample1.light.Light;
import com.saber.command.sample1.light.TurnLightCommand;
import com.saber.command.sample1.light.TurnOffLightCommand;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("sample 1 command.....");
        Fan fan = new Fan();
        Light light = new Light();
        RemoteController remote =new RemoteController();
        remote.setCommand(new DecreaseFanCommand(fan));
        remote.pressButton();
        remote.setCommand(new StopFanCommand(fan));
        remote.pressButton();
        remote.setCommand(new StartFanCommand(fan));
        remote.pressButton();
        remote.setCommand(new IncreaseFanCommand(fan));
        remote.pressButton();
        remote.setCommand(new IncreaseFanCommand(fan));
        remote.pressButton();
        remote.setCommand(new DecreaseFanCommand(fan));
        remote.pressButton();
        remote.setCommand(new StopFanCommand(fan));
        remote.pressButton();
        System.out.println("--------------light ---------------");
        remote.setCommand(new TurnOffLightCommand(light));
        remote.pressButton();
        remote.setCommand(new TurnLightCommand(light));
        remote.pressButton();
        remote.setCommand(new TurnOffLightCommand(light));
        remote.pressButton();
    }
}
