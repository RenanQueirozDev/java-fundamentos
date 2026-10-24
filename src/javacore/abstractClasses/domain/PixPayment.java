package javacore.abstractClasses.domain;

public class PixPayment extends Payment {

        public static final double FEE = 0.00;
        @Override
        public double calculateFee() {
            return getAmount() * FEE;
        }

        public PixPayment(double amount) {
            super(amount);
        }
    }

