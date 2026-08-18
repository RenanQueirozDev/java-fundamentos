package javacore.accessModifiers.domain;


public class Employee {
    private double salary;
    private String position;
    private boolean speaksEnglish;
    private String name;
    private int age;


    public void setPosition(String position) {
        if (position.equalsIgnoreCase("Intern")
                || position.equalsIgnoreCase("Junior")
                || position.equalsIgnoreCase("Pleno")
                || position.equalsIgnoreCase("senior")) {
            this.position = position;
        }
    }

    public void setSalary(double salary) {
        if (salary < 0) {

        } else if (position == null) {
        } else if (validateSalary(salary)) {
            this.salary = salary;
        }

    }

    public Employee (String name, int age, String position, boolean speaksEnglish) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.speaksEnglish = speaksEnglish;
    }


    public boolean validateSalary(double salary) {
        if (position.equalsIgnoreCase("Intern") && salary > 2000) {
            return false;

        } else if (position.equalsIgnoreCase("junior") && salary > 5000) {
            return false;

        } else if (position.equalsIgnoreCase("Mid") && salary > 10000) {
            return false;

        } else if (position.equalsIgnoreCase("Senior") && salary > 20000) {
            return false;
        }
        return true;
    }

    public double bonus() {
        double bonus;
        if (speaksEnglish)
            bonus = salary * 0.40;
        else bonus = 0;
        return bonus;
    }
        public double totalSalary() {
            return salary + bonus();
        }

    public void printInfo() {
        System.out.println("-----------------------------------------------");
        System.out.println("name = " + this.name);
        System.out.println("age = " + this.age);
        System.out.println("Old position = " + position);
        System.out.println("position = " + getPosition());
        System.out.println("salary = " + this.salary);
        System.out.println("bonus = " + bonus());
        if (speaksEnglish) {
            System.out.println("you got a bonus for speaking English");

        } else {
            System.out.println("You didn't get a bonus for speaking English.");
        }
        System.out.println("total salary = " + totalSalary());
        System.out.println("-----------------------------------------------");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public boolean getSpeaksEnglish() {
        return speaksEnglish;

    }

    public double getSalary () {
            return salary;
        }

        public String getPosition () {
            return position;
        }
    }










