package com.saber.state.sample2;

public interface ATMState {
    void enterCard();

    void enterPin(int pin);

    void enterAmount(double amount);

    void withDrawCash();
}