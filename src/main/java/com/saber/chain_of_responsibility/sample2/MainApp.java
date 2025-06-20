package com.saber.chain_of_responsibility.sample2;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("sample 2 chain_of_responsibility");
        var paymentHandler = getPaymentHandler();
        paymentHandler.process(56000);
        paymentHandler.process(560000);
        paymentHandler.process(1500000);
        paymentHandler.process(8500000);
        paymentHandler.process(35000000);
        paymentHandler.process(85000000);
        paymentHandler.process(150000000);
        paymentHandler.process(1500000000);
    }

    private static PaymentHandler getPaymentHandler() {
        var cash = new Cash();
        var card = new Card();
        var cheque = new Cheque();
        cash.setNexPaymentHandler(card);
        card.setNexPaymentHandler(cheque);
        return cash;

    }
}
