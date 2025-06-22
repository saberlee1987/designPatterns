package com.saber.state.sample2;

public class CardState implements ATMState{
    @Override
    public void enterCard() {
        System.out.println("card already entered ....");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("please enter pin : "+pin);
    }

    @Override
    public void enterAmount(double amount) {
        System.out.println("please enter pin first ....");
    }

    @Override
    public void withDrawCash() {
        System.out.println("please enter pin first ....");
    }
}
