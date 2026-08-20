package javacore.accessModifiers.test;


import javacore.accessModifiers.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("renan", 23, "intern", 1500);
        employee.setSpeaksEnglish(true);
        employee.setPosition("junior");
        employee.setSalary(5500.00);
        employee.printInfo();

        Employee employee2 = new Employee("Raquel","intern",1200);
        employee2.setPosition("junior");
        employee2.setAge(28);
        employee2.setSalary(3100.00);
        employee2.printInfo();


    }

}
