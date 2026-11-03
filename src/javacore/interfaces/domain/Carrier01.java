package javacore.interfaces.domain;

public class Carrier01 implements ShippingFee {
    private double pricePerKg = 3.00;

    @Override
    public double CalculateFee(double kg) {
        if (kg > 50) {
            System.out.println("Weight exceeds the allowed limit");
            return -1;
        }
        return kg * pricePerKg;
    }
}
