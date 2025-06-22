package com.saber.state.sample2;

public class ATM {
    private ATMState atmState;

    public ATM() {
        atmState = new IdleState();
    }

    public void changeState(ATMState newState) {
        this.atmState = newState;
    }

    public void enterCard() {
        atmState.enterCard();
    }

    public void enterPin(int pin) {
        atmState.enterPin(pin);
    }

    public void enterAmount(double amount) {
        atmState.enterAmount(amount);
    }

    public void withDrawCash() {
        atmState.withDrawCash();
    }
}
