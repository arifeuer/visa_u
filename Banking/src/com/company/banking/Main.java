package com.company.banking;

public class Main {

    public static void main(String[] args) {
	    Account[] accounts = new Account[] {new MortgageAccount("Alice", 100000), new CheckingAccount("Bob", 200), new CheckingAccount("Mallory", 1000)};

	    for (int i = 0; i < 3; i++) {
	        Account account = accounts[i];
            boolean dep_1000 = account.deposit(1000);
            System.out.printf("dep_1000: %b; new balance: %d%n", dep_1000, account.getBalance());
            boolean with_500 = account.withdraw(500);
            System.out.printf("with_500: %b; new balance: %d%n", with_500, account.getBalance());
            boolean with_1000 = account.withdraw(1000);
            System.out.printf("with_1000: %b; new balance: %d%n", with_1000, account.getBalance());
            boolean with_2000 = account.withdraw(2000);
            System.out.printf("with_2000: %b; new balance: %d%n%n%n", with_2000, account.getBalance());

        }
    }
}
