package javacore.toString.domain;

public class Ninja {
    private int numberShuriken;
    private String name;

    @Override
    public String toString() {
        return "Ninja \n" +
                "Numbers Shurikens = " + numberShuriken +  "\n" +
                "Name = " + name;
    }

    public int getNumberShuriken() {
        return numberShuriken;
    }

    public void setNumberShuriken(int numberShuriken) {
        this.numberShuriken = numberShuriken;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            System.out.println("Invalid name");
        } else {
            this.name = name;
        }
    }
}