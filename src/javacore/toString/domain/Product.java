package javacore.toString.domain;

public class Product {
    private String name;
    private double price;
    private int quantity;

    @Override
    public String toString() {
        return "Product" +  '\n' +
                "Name: " + name + '\n' +
                "Price: " + price +  '\n' +
                "Quantity: " + quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
