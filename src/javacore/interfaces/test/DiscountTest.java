package javacore.interfaces.test;

import javacore.interfaces.domain.DiscountFix;
import javacore.interfaces.domain.PercentageDiscount;

public class DiscountTest {
    public static void main(String[] args) {
        DiscountFix discountFix = new DiscountFix(10);
        PercentageDiscount percentageDiscount= new PercentageDiscount(25);

        System.out.println("Fixo: " + discountFix.applyDiscount(80));

        System.out.println("Percentual: " + percentageDiscount.applyDiscount(80));
        DiscountFix fixoInvalido = new DiscountFix(200);

        PercentageDiscount percentualInvalido = new PercentageDiscount(150);

    }
}
