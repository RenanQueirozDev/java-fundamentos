package javacore.objectAssociation.test;
/* **Requisitos:**

        - **Seminário: Deve ter um título e, obrigatoriamente, um local. Pode conter nenhum ou vários alunos.
        - **Estudante: Deve ter nome e idade. Cada aluno pode estar matriculado em apenas um seminário.
 - **Professor: Deve ter nome e especialidade. Um professor pode ministrar vários seminários.
        - **Local: Deve ter um endereço.

        **Atributos Básicos:**

        - **Seminário: Título
 - **Estudante: Nome, idade
 - **Professor: Nome, especialidade
 - **Local: Endereço
 */

import javacore.objectAssociation.domain.*;

public class SeminarTest {
   public static void main(String[] args) {

       StudentSeminar[] students = new StudentSeminar[3];
       StudentSeminar student01 = new StudentSeminar("Renan", 23);
       StudentSeminar student02 = new StudentSeminar("Buukz", 21);
       StudentSeminar student03 = new StudentSeminar("Salie", 35);
       students[0] = student01;
       students[1] = student02;
       students[2] = student03;

     SeminarAddress seminarAddress = new SeminarAddress("Downtown");
     Seminar[] seminars = new Seminar[2];
     Seminar seminar01 = new Seminar("Bomb", students, seminarAddress);
     Seminar seminar02 = new Seminar("Tag", students, seminarAddress);
     seminars[0] = seminar01;
     seminars[1] = seminar02;


       student01.setSeminar(seminar01);
       student02.setSeminar(seminar02);
       student03.setSeminar(seminar01);

       TeacherSeminar teacherSeminar = new TeacherSeminar("Os piores", "Pixo");
       teacherSeminar.setSeminars(seminars);








   }
}
