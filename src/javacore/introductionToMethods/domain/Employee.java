package javacore.introductionToMethods.domain;

import java.util.Scanner;

public class Employee {
    Scanner keyboardInput = new Scanner(System.in);

    public String name;
    public int age;
    public double[] salaries = new double[3];


    public void setSalaries() {
        for (int i = 0; i < salaries.length; i++) {
            System.out.println("Enter 3 salaries to calculate the average.");
            salaries[i] = keyboardInput.nextDouble();
        }
    }

    public void printSalaries() {
        for (int i = 0; i < salaries.length; i++) {
            System.out.println(salaries[i]);
        }
    }

    public void averageSalary() {
        double result = 0;
        for (int i = 0; i < salaries.length; i++) {
            result = result + salaries[i];


    }
        double average = result / salaries.length;
        System.out.println(average);

    }
    public void printInfo() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Salaries = ");
        printSalaries();
        System.out.println("Average Salary = ");
        averageSalary();
    }

    }
















