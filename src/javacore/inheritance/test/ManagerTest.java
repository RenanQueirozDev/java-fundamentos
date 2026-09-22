package javacore.inheritance.test;

import javacore.inheritance.domain.Manager;

public class ManagerTest {
    public static void main(String[] args) {
        Manager manager = new Manager("Ronaldinho Neto", 7500, 7);
       manager.salaryIncrease();
       manager.printInfo();


    }
}
