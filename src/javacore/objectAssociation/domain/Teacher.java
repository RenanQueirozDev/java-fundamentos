package javacore.objectAssociation.domain;

public class Teacher {
  private String name;
    private int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void print() {
        System.out.println(name);
        System.out.println(age);
    }
}
