package edu.uno.csci2830;
public class Account {
    private final String accountNumber;
    private final String accountName;
    private double accountBalance;
    private static Integer withdrawalCount = 0;

    public Account(String accountNumber, String accountName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;

        //cant set balance to negative, if negative set to 0
        this.accountBalance = accountBalance;
        if (accountBalance < 0) this.accountBalance = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && accountBalance >= amount) {
            accountBalance -= amount;
            return true;
        } else {
            return false;
        }
    }

}
