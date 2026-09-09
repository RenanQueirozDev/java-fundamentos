package javacore.objectAssociation.domain;
/* Exercício: Sistema de Gerenciamento de Seminários**

 O objetivo é criar um sistema que gerencie seminários, realizando o
 cadastro de estudantes, professores e o local onde o
 seminário será realizado, aplicando conceitos de associação entre classes.

 **Requisitos:**

 - **Seminário: Deve ter um título e, obrigatoriamente, um local. Pode conter nenhum ou vários alunos. OK
 - **Estudante: Deve ter nome e idade. Cada aluno pode estar matriculado em apenas um seminário. OK
 - **Professor: Deve ter nome e especialidade. Um professor pode ministrar vários seminários. OK
 - **Local: Deve ter um endereço.

 **Atributos Básicos:**

 - **Seminário: Título
 - **Estudante: Nome, idade
 - **Professor: Nome, especialidade
 - **Local: Endereço
 */
public class TeacherSeminar {
    private String name;
    private String specialty;
    private Seminar[] seminars;

    public TeacherSeminar(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }
}
