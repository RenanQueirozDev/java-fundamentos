package javacore.introductionToClasses.test;

import javacore.introductionToClasses.domain.Car;


public class CarTest {
   public static void main(String[] args) {
        Car car = new Car();
        Car car02 = new Car();
        car.manufacturer = "Volkswagen";
        car.model = "CrossFox";
        car.year = 2014;
        car.color = "Yellow";

        car02.manufacturer = "Chevrolet";
        car02.model = "Monza";
        car02.year = 1992;
        car02.color = "Blue";
        System.out.println("Manufacturer: " + car.manufacturer +
                "\nModel: " + car.model +
                "\nColor: " + car.color +
                "\nYear: " + car.year);
        System.out.println("---------------------------------------");
        System.out.println("Manufacturer: " + car02.manufacturer +
                "\nModel: " + car02.model +
                "\nCor: " + car02.color +
                "\nYear: " + car02.year);
    }
}