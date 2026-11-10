package javacore.polymorphism.domain;

public class Commom extends Tickets {

    public Commom(String buyer, double basePrice) {
        super(buyer, basePrice);
    }

    @Override
    public double calculatePrice() {
        return getBasePrice();
    }
}
