package edu.uno.csci2830;

public class Saving extends Account {
    private final double minimumBalance = 100;
    private double accountBalance;

    public Saving(String accountNumber, String accountName, double accountBalance) {
        super(accountNumber, accountName, accountBalance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && (accountBalance - amount) >= minimumBalance) {
            accountBalance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
