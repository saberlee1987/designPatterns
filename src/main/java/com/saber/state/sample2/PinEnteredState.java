package com.saber.state.sample2;

public class PinEnteredState implements ATMState{
    @Override
    public void enterCard() {
        System.out.println("card already entered ....");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("pin already entered ....");
    }

    @Override
    public void enterAmount(double amount) {
        System.out.println("enter amount : "+amount);
    }

    @Override
    public void withDrawCash() {
        System.out.println("please enter amount first ....");
    }
}
