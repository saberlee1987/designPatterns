package com.saber.state.sample1;

public class TrafficLightController {
    private TrafficLight currentState;

    public TrafficLightController() {
        currentState = new RedTrafficLight();
    }

    public void changeState(TrafficLight newState) {
        currentState = newState;
    }

    public void displayState() {
        this.currentState.display();
    }
}
