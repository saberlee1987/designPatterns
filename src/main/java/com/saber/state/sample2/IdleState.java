package com.saber.state.sample2;

public class IdleState implements ATMState{
    @Override
    public void enterCard() {
        System.out.println("card inserted ........");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("please enter card first ....");
    }

    @Override
    public void enterAmount(double amount) {
        System.out.println("please enter card first ....");
    }

    @Override
    public void withDrawCash() {
        System.out.println("please card first ....");
    }
}
