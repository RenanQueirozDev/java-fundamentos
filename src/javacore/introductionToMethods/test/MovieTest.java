package javacore.introductionToMethods.test;

import javacore.introductionToMethods.domain.Movie;

public class MovieTest {
    public static void main(String[] args) {
        Movie movie = new Movie();

        movie.title = "The great gatsby";
        movie.genre = "Drama";
        movie.durationMinutes = 143;
        movie.rating= 7.2;

        movie.printInfo();
    }
}
