package javacore.abstractClasses.test;

import javacore.abstractClasses.domain.StudentTicket;
import javacore.abstractClasses.domain.Ticket;
import javacore.abstractClasses.domain.VipTicket;

/* In the main method:

- Create the following three tickets, using variables of type Ticket:
  - StudentTicket("Festa Junina", 80.0)
  - VipTicket("Festa Junina", 80.0, "Camarote")
  - StudentTicket("Halloween", -10.0)
- Place all three in an array of Ticket with 3 positions.
- Iterate through the array using a loop, printing the summary() of each ticket and adding up the final prices.
- After the loop, print "Total: " followed by the sum */



public class TicketTest {
    public static void main(String[] args) {
        Ticket studentTicket = new StudentTicket(80, "Festa Junina");
        Ticket vipTicket = new VipTicket(80, "Festa Junina", "Camarote");
        Ticket studentTicket2 = new StudentTicket(-10, "Halloween");

        Ticket tickets[] = new Ticket[3];
        tickets[0] = studentTicket;
        tickets[1] = studentTicket2;
        tickets[2] = vipTicket;


        double total = 0;
        for (int i = 0; i < tickets.length; i++) {
            System.out.println(tickets[i].summary());
            total += tickets[i].calculateFinalPrice();
        }
        System.out.println("Total: " + total);
    }
}
