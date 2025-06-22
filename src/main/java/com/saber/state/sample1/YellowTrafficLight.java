package com.saber.state.sample1;

public class YellowTrafficLight implements TrafficLight {
    @Override
    public void display() {
        System.out.println("yellow Light!prepare stop!!!");
    }
}
