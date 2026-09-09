package javacore.objectAssociation.domain;
/* Exercício: Sistema de Gerenciamento de Seminários**

 O objetivo é criar um sistema que gerencie seminários, realizando o
 cadastro de estudantes, professores e o local onde o
 seminário será realizado, aplicando conceitos de associação entre classes.

 **Requisitos:**

 - **Seminário: Deve ter um título e, obrigatoriamente, um local. Pode conter nenhum ou vários alunos. OK
 - **Estudante: Deve ter nome e idade. Cada aluno pode estar matriculado em apenas um seminário. OK
 - **Professor: Deve ter nome e especialidade. Um professor pode ministrar vários seminários.
 - **Local: Deve ter um endereço.

 **Atributos Básicos:**

 - **Seminário: Título
 - **Estudante: Nome, idade
 - **Professor: Nome, especialidade
 - **Local: Endereço
 */
public class StudentSeminar {
    private int age;
    private String name;
    private Seminar seminar;

    public StudentSeminar(String name, int age) {
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

    public Seminar getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }
}

