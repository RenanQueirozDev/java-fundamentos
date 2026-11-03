package javacore.interfaces.domain;

public class Carrier02 implements ShippingFee{
    private double pricePerkg = 15.00;

    @Override
    public double CalculateFee( double kg) {
        if (kg < 0) {
            System.out.println("Weight exceeds the allowed limit");
            return -1;
        }
        return kg * 1.50 + pricePerkg;
    }
}
