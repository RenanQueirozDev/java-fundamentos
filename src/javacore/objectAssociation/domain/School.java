package javacore.objectAssociation.domain;
import javacore.objectAssociation.domain.Teacher;

public class School {
    String name;
    Teacher[] teachers;

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public void print() {
        System.out.println(name);
        for (int i = 0; i < teachers.length; i++) {
            teachers[i].print();

        }
    }
}
