package javacore.finalMethods.domain;

public class BankAccount {
        public final int accountNumber;
        public static final double MAINTENANCE_FEE = 12.50;
        private double balance;

        public BankAccount(int accountNumber) {
            this.accountNumber = accountNumber;
        }

    @Override
    public String toString() {
        return "---- Bank Account ---  " +  "\n" +
                "Number account = " + accountNumber + "\n"+
                "Balance = " + balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public final void applyFee() {
        balance -= MAINTENANCE_FEE;


    }

        }


