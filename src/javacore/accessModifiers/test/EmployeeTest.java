package javacore.accessModifiers.test;


import javacore.accessModifiers.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("renan", 23,"intern", 1290);
        employee.setSpeaksEnglish(true);
        employee.setPosition("junior");
        employee.setSalary(456700.00);
        employee.printInfo();

        Employee employee2 = new Employee("Raquel","intern", 1299);
        employee2.setPosition("junior");
        employee2.setAge(28);
        employee2.setSalary(3100.00);
        employee2.printInfo();


    }

}
