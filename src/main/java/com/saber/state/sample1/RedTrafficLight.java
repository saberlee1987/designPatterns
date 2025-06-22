package com.saber.state.sample1;

public class RedTrafficLight implements TrafficLight {
    @Override
    public void display() {
        System.out.println("RED Light.stop !!!");
    }
}
