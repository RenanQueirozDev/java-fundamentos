package javacore.accessModifiers.domain;

/*
Create a BankAccount class with a private balance attribute (double).
Add a getBalance() and a setBalance() that only accepts values greater
than or equal to zero (it doesn't allow a negative balance).
*/


public class BankAccount {
    private double balance;

    public void setBalance(double balance) {
        if (balance <= 0) {
            System.out.println("Not allowed");

        } else {
            this.balance = balance;

        }
    }
            public double getBalance() {
                return balance;

            }
        }

