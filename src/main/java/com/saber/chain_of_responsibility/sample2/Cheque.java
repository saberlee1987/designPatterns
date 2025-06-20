package com.saber.chain_of_responsibility.sample2;

import java.text.NumberFormat;
import java.util.Locale;

public class Cheque extends PaymentHandler {

    @Override
    public void process(int amount) {
        if (amount <= 300_000_000) {
            System.out.println("payment process " +
                    NumberFormat.getCurrencyInstance(new Locale("fa")).format(amount)
                    + " T by Cheque");
        } else {
            super.process(amount);
        }
    }
}
