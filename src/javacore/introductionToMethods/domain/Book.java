package javacore.introductionToMethods.domain;




public class Book {
    public String title;
    public String author;
    public int pages;


    public boolean isLong() {
        return pages > 300;

    }


    public void printInfo() {
        System.out.println("Title = " + title);
        System.out.println("Author = " + author);
        System.out.println("Pages = " + pages);
        if (isLong()) {
            System.out.println("This book is long.");
        } else {
            System.out.println("This book is short.");
        }

    }


    }

