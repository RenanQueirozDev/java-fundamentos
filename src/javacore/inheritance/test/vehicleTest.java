package javacore.inheritance.test;

//In the test: create a Car and a Motorhome, call describe() on both, and observe the difference.”

import javacore.inheritance.domain.Car;
import javacore.inheritance.domain.Motorhome;

public class vehicleTest {
    public static void main(String[] args) {
        Car car = new Car("Nissan", 250, 2);
        car.printInfo();
        Motorhome motorhome = new Motorhome("Winnebago",160, true);
        motorhome.printInfo();
    }
}
