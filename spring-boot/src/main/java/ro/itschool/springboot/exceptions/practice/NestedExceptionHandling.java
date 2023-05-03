package ro.itschool.springboot.exceptions.practice;

import java.io.IOException;

public class NestedExceptionHandling {

    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            parseAndDivide("23", "7");
        } catch (ArithmeticException | IOException e) {
            throw new RuntimeException("Arithmetic exception was thrown!");
        }

//        System.out.println("Case1" + parseAndDivide("10", "5"));
//        System.out.println("Case2" + parseAndDivide("10", "0"));
//        System.out.println("Case3" + parseAndDivide("10", "A"));
    }

    public static double parseAndDivide(String numeratorStr, String denominatorStr) throws IOException {
        try {
            int numerator = Integer.parseInt(numeratorStr);
            int denominator = Integer.parseInt(denominatorStr);

            try {
                double result = (double) numerator / denominator;
            } catch (ArithmeticException arithmeticException) {
                System.out.println("Division by zero.");
            }
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Invalid input.");
        }
        return 0;
    }
}
