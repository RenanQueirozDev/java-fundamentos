package javacore.accessModifiers.domain;

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

