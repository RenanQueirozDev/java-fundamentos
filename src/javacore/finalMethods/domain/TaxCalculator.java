package javacore.finalMethods.domain;
public class TaxCalculator {

    public double calculateTax(double amount) {
        final double taxRate = 0.15;
        return amount * taxRate;

    }
}
