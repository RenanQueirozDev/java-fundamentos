package javacore.finalMethods.test;

import javacore.finalMethods.domain.BankAccount;
import javacore.finalMethods.domain.TaxCalculator;

public class TaxCalculatorTest {
    static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        System.out.println(taxCalculator.calculateTax(123));
    }
}
