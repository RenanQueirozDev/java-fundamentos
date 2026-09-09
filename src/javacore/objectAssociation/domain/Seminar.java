package javacore.objectAssociation.domain;

/* Exercício: Sistema de Gerenciamento de Seminários**

 O objetivo é criar um sistema que gerencie seminários, realizando o
 cadastro de estudantes, professores e o local onde o
 seminário será realizado, aplicando conceitos de associação entre classes.

 **Requisitos:**

 - **Seminário: Deve ter um título e, obrigatoriamente, um local. Pode conter nenhum ou vários alunos. OK
 - **Estudante: Deve ter nome e idade. Cada aluno pode estar matriculado em apenas um seminário.
 - **Professor: Deve ter nome e especialidade. Um professor pode ministrar vários seminários.
 - **Local: Deve ter um endereço.

 **Atributos Básicos:**

 - **Seminário: Título
 - **Estudante: Nome, idade
 - **Professor: Nome, especialidade
 - **Local: Endereço
 */

public class Seminar {
    private String title;
    private StudentSeminar[] studentSeminars;
    private SeminarAddress seminarAddress;

public Seminar(String title, StudentSeminar[] studentSeminars, SeminarAddress seminarAddress) {
    this.title = title;
    this.studentSeminars = studentSeminars;
    this.seminarAddress = seminarAddress;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String tittle) {
        this.title = tittle;
    }
}


