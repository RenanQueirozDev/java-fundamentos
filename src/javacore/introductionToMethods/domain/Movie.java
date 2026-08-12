package javacore.introductionToMethods.domain;

public class Movie {
    public String title;
    public String genre;
    public int durationMinutes;
    public double rating;

    public boolean isShort() {
        return durationMinutes < 90;
    }

    public boolean isWellRated() {
        return rating >= 7.0;

    }

    public void printInfo() {
        System.out.println(this.title);
        System.out.println(this.genre);
        System.out.println(this.durationMinutes);
        if (isShort()) {
            System.out.println("This movies is short");

        } else {
            System.out.println("This movies is long");
        }

            if (isWellRated()) {
                System.out.println("This movie is well-rated. It has a rating above 7. ");


            } else {
                System.out.println("This movie isn't well-rated. It has a rating below 7." );
            }
        System.out.println("Rating is " + this.rating);
        }
    }
