package com.saber.command.sample1.light;

public class Light {
    private boolean state;
    public void turnLight() {
        if (!state) {
            state = true;
            System.out.println("light turn light ....");
        } else {
            System.out.println("light before turn light ....");
        }
    }

    public void turnOffLight() {
        if (state) {
            state = false;
            System.out.println("light turn off light ....");
        } else {
            System.out.println("light is turn of light ....");
        }
    }
}
