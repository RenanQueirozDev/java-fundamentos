package javacore.finalMethods.test;

import javacore.finalMethods.domain.BankAccount;

/*
Class BankAccount:

final attribute accountNumber (String) — assigned only in the constructor
Regular attribute balance (double)
Class constant MAINTENANCE_FEE (double), static final
final method applyFee() — subtracts MAINTENANCE_FEE from balance

In main, try:

java
BankAccount account = new BankAccount("12345", 1000.0);
account.accountNumber = "99999"; // try reassigning
 */
public class BankAccountTest {
public static void main(String[] args) {
    BankAccount account = new BankAccount(12345);
    account.accountNumber = 99999;
}


    }
