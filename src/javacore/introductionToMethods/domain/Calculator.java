package javacore.introductionToMethods.domain;


public class Calculator {

    public void sumTwoNumbers(float number01, float number02) {
        System.out.println(number01 + number02);
    }

    public void subtractTwoNumbers(float number01, float number02) {
        System.out.println(number01 - number02);
    }

    public void multiplicationTwoNumbers(float number01, float number02) {

        System.out.println(number01 * number02);
    }

    public double divideTwoNumbers(double number01, double number02) {
        if (number02 == 0) {

            System.out.println("Division by zero is not defined");
            return 0;
        }
        return number01 / number02;
    }
}