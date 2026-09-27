package javacore.finalMethods.domain;

public class BankAccount {
        public final int accountNumber;
        public static final double MAINTENANCE_FEE = 12.50;
        private double balance;

        public BankAccount(int accountNumber) {
            this.accountNumber = accountNumber;
        }
    public final void applyFee() {
        balance -= MAINTENANCE_FEE;
    }

        }


