package javacore.inheritance.domain;
/*
Employee com name/salary (protected), construtor, printInfo() OK
Manager extends Employee — soma teamSize, sobrescreve printInfo()
Acessa name/salary direto (sem getter) dentro de Manager, pra testar protected na prátic
 */
public class Employee {
    protected String name;
    protected int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public void printInfo() {
        System.out.println("My name is " + name + "\n My salary is "  +  salary);
    }
}
