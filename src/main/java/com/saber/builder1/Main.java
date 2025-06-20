package com.saber.builder1;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Customer customer =  Customer.builder()
                .setId(12L)
                .setCustomerNo("145698")
                .setFullName("saber66")
                .setBirthDate(LocalDateTime.of(1987,12,7,6,0)
                        .toString())
                .setCreatedDate(LocalDateTime.now().toString())
                .build();
        System.out.println(customer);
    }
}
