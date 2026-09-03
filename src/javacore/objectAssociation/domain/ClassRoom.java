package javacore.objectAssociation.domain;

public class ClassRoom {
    private String name;
    private Student[] students;

    public ClassRoom(String name, Student[] student) {
        this.name = name;;
        this.students = student;

    }
    public Student[] getStudents() {
        return students;
    }

    public void print() {
            System.out.println(name);
        for (int i = 0; i < students.length; i++) {
            students[i].print();
        }


        }
    }



