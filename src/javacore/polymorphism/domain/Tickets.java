package javacore.polymorphism.domain;

public abstract class Tickets {
    private String buyer;
    private double basePrice;

    public abstract double calculatePrice();

    public Tickets(String buyer, double basePrice) {
        this.buyer = buyer;
        this.basePrice = basePrice;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
