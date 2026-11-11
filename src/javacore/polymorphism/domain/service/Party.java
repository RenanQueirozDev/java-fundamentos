package javacore.polymorphism.domain.service;
import javacore.polymorphism.domain.Tickets;
import javacore.polymorphism.domain.Vip;


public class Party {


    public static void Report(Tickets[] tickets) {
        for (int i = 0; i < tickets.length; i++) {
            Tickets ticketFor = tickets[i];
            System.out.println( ticketFor.getBuyer() + ": " + ticketFor.calculatePrice() );
            if (ticketFor instanceof Vip ) {
                Vip vip = (Vip) ticketFor;
                System.out.println("  Drinks: " + ((Vip) ticketFor).getDrinks());
        }
        }
    }

    public static int totalDrinks(Tickets[] tickets) {
        int drinks = 0;
        for (int i = 0; i < tickets.length; i++) {
            Tickets ticketFor = tickets[i];
          if (ticketFor instanceof Vip) {
              Vip vip = (Vip) ticketFor;
            drinks = drinks + ((Vip) ticketFor).getDrinks();
          }

        }
        return drinks;                                // provisório, a lógica entra na etapa 4
    }
}

