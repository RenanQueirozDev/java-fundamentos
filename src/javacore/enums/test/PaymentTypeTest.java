package javacore.enums.test;

import javacore.enums.domain.PaymentType;

public class PaymentTypeTest {
    public static void main(String[] args) {
                PaymentType payment = PaymentType.findByCode(2);
                System.out.println(payment.getDisplayName());
                System.out.println(payment.calculateFee(100));

                payment = PaymentType.findByCode(3);
                System.out.println(payment.getDisplayName());
                System.out.println(payment.calculateFee(100));
            }
        }