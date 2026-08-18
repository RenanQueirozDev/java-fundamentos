package javacore.accessModifiers.test;


import javacore.accessModifiers.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("renan", 23, "intern", true);
        employee.setPosition("junior");
        employee.setSalary(4900.00);
        employee.printInfo();



    }

}
