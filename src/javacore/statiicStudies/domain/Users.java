package javacore.statiicStudies.domain;

public class Users{
   private static int userCount;

   public static int count() {
       return userCount;
   }

   public Users() {
       userCount++;

   }
}
