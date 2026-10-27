package javacore.abstractClasses.domain;
/*
Create an abstract class Ticket with:

- Private attributes eventName (String) and basePrice (double).
- A constructor that receives both attributes and calls the basePrice setter instead of assigning the value directly.
- setBasePrice: if the value is less than or equal to 0, do not change the attribute and print "Invalid price".
- Getters for both attributes.
- An abstract method calculateFinalPrice() that returns a double.
- A concrete method summary() that returns a String in the format "Festa Junina - R$ 40.0", using calculateFinalPrice().

Create two subclasses:

StudentTicket: the final price is 50% of the base price.

VipTicket: has an additional attribute loungeName, received in the constructor (which uses super(...)), and the final price is the base price plus 40.0.

In the main method:

- Create the following three tickets, using variables of type Ticket:
  - StudentTicket("Festa Junina", 80.0)
  - VipTicket("Festa Junina", 80.0, "Camarote")
  - StudentTicket("Halloween", -10.0)
- Place all three in an array of Ticket with 3 positions.
- Iterate through the array using a loop, printing the summary() of each ticket and adding up the final prices.
- After the loop, print "Total: " followed by the sum.
 */
public abstract class Ticket {
    private String eventName;
    private double basePrice;

    public Ticket(double basePrice, String eventName) {
        setEventName(eventName);
        setBasePrice(basePrice);
    }

    public abstract double calculateFinalPrice();

    public String summary() {
        return "Event Name: " + getEventName() + " Price: " + calculateFinalPrice();
    }
    public String getEventName() {
        return eventName;
    }

    public void setBasePrice(double basePrice) {
        if (basePrice <= 0) {
            System.out.println("Invalid price");
        } else {
            this.basePrice = basePrice;
        }
    }
    public double getBasePrice() {
        return basePrice;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}
