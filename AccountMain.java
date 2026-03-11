package edu.uno.csci2830;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        Saving savingAccount1 = new Saving("12345", "John Doe", 250);
        Checking checkingAccount1 = new Checking("54321", "John Doe", 100);

        // check getters - final balance
        System.out.println("Savings Account Number: " + savingAccount1.getAccountNumber());
        System.out.println("Savings Account Name: " + savingAccount1.getAccountName());
        System.out.println("Savings Account Balance: " + savingAccount1.getAccountBalance() + "\n");
        // check getters
        System.out.println("Checking Account Number: " + checkingAccount1.getAccountNumber());
        System.out.println("Checking Account Name: " + checkingAccount1.getAccountName());
        System.out.println("Checking Account Balance: " + checkingAccount1.getAccountBalance() + "\n");


        //let users deposit/withdraw from account
        //check deposit
        System.out.println("Which account would like to acccess? (1 - savings/ 2 - checking)");
        Integer userInput = i.nextInt();
        if (userInput == 1) {
            System.out.println("You have selected the saving account.");

            // let users deposit/withdraw from savings
            System.out.println("1 - Deposit, 2 - Withdraw or 3 - exit program? (1/2/3)");
            userInput = i.nextInt();
            while (userInput != 3) {
                if (userInput == 1) {
                    System.out.println("How much would you like to deposit?");
                    double depositAmount = i.nextDouble();
                    boolean depBool = savingAccount1.deposit(depositAmount);
                    if (depBool == false) {
                        System.out.println("Incorrect amount given. Please try again.");
                    }
                } else if (userInput == 2) {
                    System.out.println("How much would you like to withdraw?");
                    double withdrawAmount = i.nextDouble();
                    boolean withBool = savingAccount1.withdraw(withdrawAmount);
                    if (withBool == false) {
                        System.out.println("Amount exceeds minimum balance. Please try again.");
                    }
                } else if (userInput == 3) {
                    break;
                } else {
                    System.out.println("Invalid input. Please try again.");
                }
                System.out.println("1 - Deposit, 2 - Withdraw or 3 - exit program? (1/2/3)");
                userInput = i.nextInt();
            }
            
        } else if (userInput == 2) {
            System.out.println("You have selected the checking account.");

            // let users deposit/withdraw from checking
            System.out.println("1 - Deposit, 2 - Withdraw or 3 - exit program? (1/2/3)");
            userInput = i.nextInt();
            while (userInput != 3) {
                if (userInput == 1) {
                    System.out.println("How much would you like to deposit?");
                    double depositAmount = i.nextDouble();
                    boolean depBool = checkingAccount1.deposit(depositAmount);
                    if (depBool == false) {
                        System.out.println("Incorrect amount given. Please try again.");
                    }
                } else if (userInput == 2) {
                    System.out.println("How much would you like to withdraw?");
                    double withdrawAmount = i.nextDouble();
                    boolean withBool = checkingAccount1.withdraw(withdrawAmount);
                    if (withBool == false) {
                        System.out.println("Incorrect amount given. Please try again.");
                    }
                } else if (userInput == 3) {
                    break;
                } else {
                    System.out.println("Invalid input. Please try again.");
                }
                System.out.println("1 - Deposit, 2 - Withdraw or 3 - exit program? (1/2/3)");
                userInput = i.nextInt();
            }
        }

        checkingAccount1.applyInterest();

        // check getters - final balance
        System.out.println("Savings Account Number: " + savingAccount1.getAccountNumber());
        System.out.println("Savings Account Name: " + savingAccount1.getAccountName());
        System.out.println("Savings Account Balance: " + savingAccount1.getAccountBalance() + "\n");
        // check getters
        System.out.println("Checking Account Number: " + checkingAccount1.getAccountNumber());
        System.out.println("Checking Account Name: " + checkingAccount1.getAccountName());
        System.out.println("Checking Account Balance: " + checkingAccount1.getAccountBalance() + "\n");

        i.close();
    }
}
