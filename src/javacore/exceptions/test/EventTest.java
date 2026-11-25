package javacore.exceptions.test;

import javacore.exceptions.domain.Event;
import javacore.exceptions.domain.InsufficientTicketsException;

public class EventTest {
    public static void main(String[] args) {
        Event event = new Event("Rock Show", 10);
        int[] orders = {4, 0, 8, 6};
        for (int i = 0; i < orders.length; i++) {
            try {
                event.sell(orders[i]);
                System.out.println("Sold " + orders[i] + ". Left: " + event.getTickets());
            } catch (InsufficientTicketsException e) {
                System.out.println("Error: " + e.getMessage() + " | Suggestion: buy " + e.getAvailable());
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        System.out.println("Final tickets: " + event.getTickets());
    }
}
