package com.saber.proxy.sample2;

public class BankAccount implements Account {
    private long balance = 0;

    @Override
    public void deposit(long amount) {
        balance += amount;
    }

    @Override
    public void withDraw(long amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance ...");
            return;
        }
        balance -= amount;
        System.out.println("withDraw : $" + amount);
    }

    @Override
    public long getBalance() {
        return this.balance;
    }
}
