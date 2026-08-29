package javacore.objectAssociation.test;

import javacore.objectAssociation.domain.Student;

public class StudentTest {
   public static void main(String[] args) {
       Student student01 = new Student("Renan", 23);
       Student student02 = new Student("Ana Myoshi", 19);
       Student[] students = new Student[2];
       students[0] = student01;
       students[1] = student02;


    }
}
