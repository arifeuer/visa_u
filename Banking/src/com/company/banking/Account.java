package com.company.banking;

/**
 * Created by afeuer on 8/8/16.
 */
public abstract class Account {
    private Long balance;
    private String holderName;

    public Account(String holderName) {
        this.holderName = holderName;
    }

    public final void transaction(String message, Long amount) {
        if (this.balance == null) {
            this.balance = amount;
        } else {
            this.balance += amount;
        }
        System.out.printf("%s: %s. New balance: %d%n", this.holderName, message, this.balance);
    }

    public long getBalance() {
        return this.balance;
    }

    abstract boolean deposit(long amount);

    abstract boolean withdraw(long amount);

}
