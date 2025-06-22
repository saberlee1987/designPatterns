package com.saber.state.sample1;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("sample 1 state");
        TrafficLightController trafficLight = new TrafficLightController();

        trafficLight.displayState();
        trafficLight.changeState(new GreenTrafficLight());
        trafficLight.displayState();
        trafficLight.changeState(new YellowTrafficLight());
        trafficLight.displayState();
        trafficLight.changeState(new RedTrafficLight());
        trafficLight.displayState();
    }
}
