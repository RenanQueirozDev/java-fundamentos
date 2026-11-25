package javacore.exceptions.domain;

public class Event {
    private String name;
    private int tickets;

    public Event(String name, int tickets) {
        this.name = name;
        this.tickets = tickets;
    }

    public int getTickets() {
        return tickets;
    }

    public void sell(int quantity) throws InsufficientTicketsException {

        if (quantity <= 0) {
            throw new IllegalArgumentException("Invalid quantity: " + quantity);
        }
        if (quantity > tickets) {
            throw new InsufficientTicketsException(quantity, tickets);
        }
        tickets = tickets - quantity;
    }
}
