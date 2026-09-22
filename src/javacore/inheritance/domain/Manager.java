package javacore.inheritance.domain;
/*
Employee com name/salary (protected), construtor, printInfo()
Manager extends Employee — soma teamSize, sobrescreve printInfo()
Acessa name/salary direto (sem getter) dentro de Manager, pra testar protected na prática
 */
public class Manager extends Employee {
    protected int teamSize;
    protected double salaryIncrease;

    public Manager(String name, int salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("My team size is " + teamSize);
        System.out.println("My increase is " + salaryIncrease);

    }

    public double salaryIncrease() {
        if (salary <= 7000) {
            System.out.println("Salary invalided");
            return 0;

        } else {
            return this.salaryIncrease = salary * 0.10;
        }

    }
}



