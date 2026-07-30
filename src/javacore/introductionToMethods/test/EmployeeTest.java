package javacore.introductionToMethods.test;

import javacore.introductionToMethods.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.name = "Renan";
        employee.age = 26;

        employee.setSalaries();
        employee.printInfo();
    }
}