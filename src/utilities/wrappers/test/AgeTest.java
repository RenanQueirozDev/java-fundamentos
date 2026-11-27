package utilities.wrappers.test;

import utilities.wrappers.domain.AgeParser;

public class AgeTest {
    public static void main(String[] args) {

        String[] inputs = {"25", "", "abc", "128"};
        for (int i = 0; i < inputs.length; i++) {
            try {
                Integer number = AgeParser.parse(inputs[i]);
                if (number == null) {
                    System.out.println("Age: N/A");

                } else {
                    System.out.println("Age: " + number);
                }


            } catch (NumberFormatException e) {
                System.out.println("Invalid: " + inputs[i]);
            }
            String outsideCache = "128";
            Integer first = AgeParser.parse(outsideCache);
            Integer second = AgeParser.parse(outsideCache);

            boolean sameValue = AgeParser.sameAge(first, second);
            boolean sameObject = first == second;
            System.out.println("Same value: " + sameValue);
            System.out.println("Same object: " + sameObject);

        }
    }
}