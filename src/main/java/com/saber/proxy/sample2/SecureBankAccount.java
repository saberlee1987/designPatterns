package com.saber.proxy.sample2;

import java.time.LocalDateTime;

public class SecureBankAccount implements Account {

    private final Integer secureCode;
    private final Account account;

    public SecureBankAccount(Integer secureCode) {
        this.secureCode = secureCode;
        account = new BankAccount();
    }

    private boolean authorize() {
        return true;
    }

    private boolean checkSecureCode() {
        return this.secureCode == 1486;
    }

    private void logAccess(String action) {
        System.out.println("Access logged @ " + LocalDateTime.now()
                + " with code : " + this.secureCode);

        System.out.println("Access logged @ " + LocalDateTime.now()
                + " action : " + action);
    }

    @Override
    public void deposit(long amount) {
        if (checkSecureCode() && authorize()) {
            account.deposit(amount);
            logAccess("deposit");
        } else {
            System.out.println("Access Denied!!!");
        }
    }

    @Override
    public void withDraw(long amount) {
        if (checkSecureCode() && authorize()) {
            account.withDraw(amount);
            logAccess("withDraw");
        } else {
            System.out.println("Access Denied!!!");
        }
    }

    @Override
    public long getBalance() {
        if (checkSecureCode() && authorize()) {
            logAccess("getBalance");
            return account.getBalance();
        } else {
            System.out.println("Access Denied!!!");
            return 0;
        }
    }
}
