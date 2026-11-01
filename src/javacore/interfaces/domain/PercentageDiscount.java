package javacore.interfaces.domain;

public class PercentageDiscount implements Discount {
    private double value;

    @Override
    public double applyDiscount(double price) {
        double discount = 0;
        if (price <= 0 ) {
            System.out.println("Invalid price");
            return discount;

        } else {
            discount = price * value / 100 ;
           return price - discount;

        }
    }

    public double getValue() {
        return value;
    }

    public PercentageDiscount( double value){
        setValue(value);
    }

    public void setValue ( double value) {
        if (value < 0 || value > 100) {
            System.out.println("Invalid value");
            this.value = 0;

        } else {
            this.value = value;
        }
    }
    }
