package javacore.objectAssociation.test;

import javacore.objectAssociation.domain.School;
import javacore.objectAssociation.domain.Teacher;

public class SchoolTest {
    public static void  main(String[] args) {
        School school = new School("Wizard English School");
        Teacher teacher = new Teacher("Jhonny Cajueiro", 22);
        Teacher teacher2 = new Teacher("Laurinha Flores", 67);
        Teacher[] teachers = new Teacher[2];
        teachers[0] = teacher;
        teachers[1] = teacher2;
        school.setTeachers(teachers);
        school.print();

    }
}
