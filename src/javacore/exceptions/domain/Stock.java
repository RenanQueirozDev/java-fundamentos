package javacore.exceptions.domain;

public class Stock {
    private int quantity;

    public Stock(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid quantity: " + amount);
        }
        if (amount > quantity) {
            throw new IllegalStateException("Insufficient stock: order " + amount + ", Available: " + quantity );
        }
        quantity = quantity - amount;
    }
}
