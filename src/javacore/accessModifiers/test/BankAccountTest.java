package javacore.accessModifiers.test;

import javacore.accessModifiers.domain.BankAccount;

public class BankAccountTest {
  public static void main(String[] args) {
      BankAccount bankAccount = new BankAccount();

      bankAccount.setBalance(0.0);
      System.out.println( "Your balance is " + bankAccount.getBalance());
    }

}
