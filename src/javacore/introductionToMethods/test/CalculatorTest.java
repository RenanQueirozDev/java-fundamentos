package javacore.introductionToMethods.test;
import java.util.Scanner;
import javacore.introductionToMethods.domain.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Calculator for adding: Enter two numbers");
        float number01 = scanner.nextFloat();
        float number02 = scanner.nextFloat();
        calculator.sumTwoNumbers(number01, number02);

        System.out.println("Calculator for subtract: Enter two numbers");
        number01 = scanner.nextFloat();
        number02 = scanner.nextFloat();
        calculator.subtractTwoNumbers(number01, number02);

        System.out.println("Calculator for multiplication: Enter two numbers");
        number01 = scanner.nextFloat();
        number02 = scanner.nextFloat();
        calculator.multiplicationTwoNumbers(number01, number02);


    }
}
