package javacore.abstractClasses.domain;

public class StudentTicket extends Ticket {

    public StudentTicket(double basePrice, String eventName) {
        super(basePrice, eventName);
    }

    @Override
    public double calculateFinalPrice() {
        return getBasePrice() * 0.5;
    }
}
