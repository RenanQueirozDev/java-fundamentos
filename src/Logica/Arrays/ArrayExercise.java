package Logica.Arrays;

import java.util.Scanner;

public class ArrayExercise {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.println(" Enter number for average");
        int[] note = new int[5];
        for (int i = 0; i < note.length; i++) {
            note[i] = keyboardInput.nextInt();
        }
                int sum = 0;
                for (int j = 0; j < note.length; j++) {
                    sum = sum + note[j];
                }

                int average = sum / note.length;
                System.out.println("the average is: " + average);
                    }
                }




