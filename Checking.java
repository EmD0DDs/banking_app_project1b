package edu.uno.csci2830;
public class Checking extends Account{
    private final double interestRate = 0.01;
    private double accountBalance;
    

    public Checking(String accountNumber, String accountName, double accountBalance) {
        super(accountNumber, accountName, accountBalance);
    }
    
    public void applyInterest() {
        accountBalance += accountBalance * interestRate;
    }
}
