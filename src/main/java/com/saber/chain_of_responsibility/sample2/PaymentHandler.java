package com.saber.chain_of_responsibility.sample2;

import lombok.Setter;

import java.text.NumberFormat;
import java.util.Locale;

@Setter
public class PaymentHandler {
    private PaymentHandler nexPaymentHandler;

    public void process(int amount) {
        if (nexPaymentHandler!=null) {
            nexPaymentHandler.process(amount);
        }else {

            System.out.println("sorry can not process this amount ===> "
                    + NumberFormat.getCurrencyInstance(new Locale("fa")).format(amount)+" T");
        }
    }
}
