package javacore.polymorphism.test;

import javacore.abstractClasses.domain.Ticket;
import javacore.polymorphism.domain.Commom;
import javacore.polymorphism.domain.Student;
import javacore.polymorphism.domain.Tickets;
import javacore.polymorphism.domain.Vip;
import javacore.polymorphism.domain.service.Party;

public class PartyTest {
   public static void main(String[] args) {

       Tickets ana = new Commom("Ana", 40.0);
       Tickets bruno = new Vip("Bruno", 100.0, 2);
       Tickets carla = new Student("Carla", 60.0);
       Tickets diego = new Vip("Diego", 80.0, 4);

       Tickets[] tickets = { ana, bruno, carla, diego };

     Party.Report(tickets);
       System.out.println( "Total Drinks: "+Party.totalDrinks(tickets));
    }

}
