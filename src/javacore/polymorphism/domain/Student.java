package javacore.polymorphism.domain;

public class Student extends Tickets{

    public Student(String buyer, double basePrice) {
        super(buyer, basePrice);
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * 0.5;
    }
}
