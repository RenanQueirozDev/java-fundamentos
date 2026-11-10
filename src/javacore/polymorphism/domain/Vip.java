package javacore.polymorphism.domain;

public class Vip extends Tickets{
    private int drinks;

    public Vip(String buyer, double basePrice) {
        super(buyer, basePrice);
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() + 30.0;
    }

    public int getDrinks() {
        return drinks;
    }
}
