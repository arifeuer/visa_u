package com.company.banking;

/**
 * Created by afeuer on 8/8/16.
 */
public class MortgageAccount extends Account {
    private long initBorrowedAmount;

    public MortgageAccount(String nameHolder, long initBorrowedAmount) {
        super(nameHolder);
        this.transaction("Initial Borrowed Ammount", initBorrowedAmount);
    }

    boolean deposit(long amount) {
        this.transaction("Mortgage Payment", amount);
        return true;
    }

    boolean withdraw(long amount) {
        return false;
    }
}
