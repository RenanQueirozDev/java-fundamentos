package javacore.toString.test;

import javacore.toString.domain.Ninja;

public class NinjaTest {
    public static void main(String[] args) {

        Ninja ninja = new Ninja();
        ninja.setName("renan");
        ninja.setNumberShuriken(5);

        System.out.println(ninja);
    }
}