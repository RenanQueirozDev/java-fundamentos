package javacore.abstractClasses.test;

import javacore.abstractClasses.domain.CreditCardPayment;
import javacore.abstractClasses.domain.Payment;
import javacore.abstractClasses.domain.PixPayment;

public class PaymentTest {
  public static void main(String[] args) {

      Payment payment = new PixPayment(250.00);
      Payment payment2 = new CreditCardPayment(100.00);

      System.out.println(payment);
      System.out.println(payment2);
    }
}
