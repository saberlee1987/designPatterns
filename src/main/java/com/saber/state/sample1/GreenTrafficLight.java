package com.saber.state.sample1;

public class GreenTrafficLight implements TrafficLight {
    @Override
    public void display() {
        System.out.println("Green Light.Go !!!");
    }
}
