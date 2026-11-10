package javacore.polymorphism.domain.service;
import javacore.polymorphism.domain.Tickets;
import javacore.polymorphism.domain.Vip;


public class Party {


    public static void relatorio(Tickets[] tickets) {
        for (int i = 0; i < tickets.length; i++) {
            Tickets ticketFor = tickets[i];
            System.out.println( ticketFor.getBuyer() + ": " + ticketFor.calculatePrice() );
            if (ticketFor instanceof Vip ) {
                Vip vip = (Vip) ticketFor;
        }
        }
    }

    public static int totalBebidas(Tickets[] tickets) {
        return 0;                                // provisório, a lógica entra na etapa 4
    }

}

