package com.saber.state.sample2;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("sample 2 state ....");
        ATM atm = new ATM();
        atm.enterCard();
        atm.changeState(new CardState());
        atm.enterPin(3254);
        atm.changeState(new PinEnteredState());
        atm.enterAmount(700000);
        atm.changeState(new AmountEnteredState());
        atm.withDrawCash();

    }
}
