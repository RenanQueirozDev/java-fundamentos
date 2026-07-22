package javacore.introductionToMethods.test;
// escrever um metodo que recebe dois números
// inteiros e retorna a soma — sem consultar nada.

import javacore.introductionToMethods.domain.Calculator;

import java.util.Scanner;

public class CalculatorTest02 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Calculator calculator = new Calculator();
       System.out.println("Calculator for division: Enter one number");
       double number01 = scanner.nextDouble();
       System.out.println("Enter the second number for division");
       double number02 = scanner.nextDouble();
       double result = calculator.divideTwoNumbers(number01, number02);
       System.out.println(result);

    }
}
