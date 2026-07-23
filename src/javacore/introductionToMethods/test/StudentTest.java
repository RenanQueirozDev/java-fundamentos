package javacore.introductionToMethods.test;

import javacore.introductionToMethods.domain.Student;
import javacore.introductionToMethods.domain.StudentPrinter;

public class StudentTest {
   public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student();
       StudentPrinter printer = new StudentPrinter();

       student.name = "Renan";
       student.sex = 'M';
       student.age = 23;

       student2.name = "Ana";
       student2.sex = 'F';
       student2.age = 22;

     printer.printer(student);
     printer.printer(student2);

   }
   }



