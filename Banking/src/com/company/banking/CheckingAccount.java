package com.company.banking;

/**
 * Created by afeuer on 8/8/16.
 */
public class CheckingAccount extends Account {
    private long authOverdraftAmount;

    public CheckingAccount(String holderName, long authOverdraftAmount) {
        super(holderName);
        this.authOverdraftAmount = authOverdraftAmount
    }

    boolean deposit(long amount) {
        this.transaction("Checking Deposit", amount);
        return true;
    }

    boolean withdraw(long amount) {
        if (amount >= 0) {
            System.out.println("Please use a negative number to indicate a withdrawl next time");
            System.exit(1);
        }

        long maxWithdraw = this.getBalance() + authOverdraftAmount;
        if (amount <= maxWithdraw) {
            this.transaction("Checking Withdraw", amount);
            return true;
        } else {
            return false;
        }
    }
}
