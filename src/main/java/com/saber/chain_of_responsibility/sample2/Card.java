package com.saber.chain_of_responsibility.sample2;

import java.text.NumberFormat;
import java.util.Locale;

public class Card extends PaymentHandler {

    @Override
    public void process(int amount) {
        if (amount <= 10_000_000) {
            System.out.println("payment process "
                    + NumberFormat.getCurrencyInstance(new Locale("fa")).format(amount)
                    + " T by card");
        } else {
            super.process(amount);
        }
    }
}
