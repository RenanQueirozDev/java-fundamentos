package javacore.introductionToMethods.test;

import javacore.introductionToMethods.domain.Book;


public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();

        book.title = "Geography of Hunger";
        book.author = "Josue De Castro";
        book.pages = 348;

        book.printInfo();
    }
}