package javacore.inheritance.domain;
/*
Vehicle with attributes brand and maxSpeed, a constructor requiring both, and a describe()
method that prints something like "Vehicle: [brand], max speed: [maxSpeed]" OK
Car extends Vehicle — adds the numberOfDoors attribute, with a constructor calling super() + the new attribute OK
Motorhome extends Vehicle — adds the hasBed attribute (boolean), with a constructor calling super() + the new attribute
In one of the two subclasses, override describe() to include the extra information
(doors or whether it has a bed)
In the other subclass, do not override it — let it inherit the original describe() unchanged
 */
public class Vehicle {
    private String brand;
    private int maxSpeed;

    public Vehicle(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void printInfo() {
        System.out.println("Vehicle is " + brand + "\n Velocity max:" + maxSpeed) ;

    }
}
