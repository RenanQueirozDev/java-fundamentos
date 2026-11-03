package javacore.interfaces.test;

import javacore.interfaces.domain.Carrier01;
import javacore.interfaces.domain.Carrier02;
import javacore.interfaces.domain.ShippingFee;

public class ShippingFeeTest {
    public static void main(String[] args) {
        ShippingFee carrier01 = new Carrier01();
        ShippingFee carrier02= new Carrier02();
        System.out.println( carrier01.CalculateFee(60));
        System.out.println( carrier01.CalculateFee(10));
        System.out.println( carrier02.CalculateFee(60));
        System.out.println( carrier02.CalculateFee(10));
        System.out.println( carrier02.CalculateFee(-10));
        System.out.println( carrier02.CalculateFee(-10));
    }
}
