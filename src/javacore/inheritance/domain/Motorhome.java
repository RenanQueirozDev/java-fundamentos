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
public class Motorhome extends Vehicle {
    private boolean hasBeds;

    public Motorhome(String brand, int maxSpeed, boolean hasBeds) {
        super(brand, maxSpeed);
        this.hasBeds = hasBeds;

    }
    public void printInfo() {
        System.out.println("-------------------");
       super.printInfo();
       if(hasBeds == true) {
           System.out.println("Has beds");

       } else {
           System.out.println("Has not beds");
       }
       }
    }

