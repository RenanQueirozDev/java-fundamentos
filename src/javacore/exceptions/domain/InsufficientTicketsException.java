package javacore.exceptions.domain;

public class InsufficientTicketsException extends Exception{
   private int available;

    public InsufficientTicketsException(int request, int available) {
        super("Requested " + request + ", only " + available + " left");
        this.available = available;
    }

    public int getAvailable() {
        return available;
    }

}
