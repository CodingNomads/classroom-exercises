package javafundamentals.lambdas;

import java.util.function.Predicate;

/**
 * Create a class that contains a method that accepts a Functional Interface
 * Create a field in this class Ex05VariableCapture
 * Create the psvm main method in this class: Ex05VariableCapture
 * <p>
 * Create a lambda and pass it to the method that accepts a functional interface.
 * Use the field from Ex05VariableCapture in the body of the lambda.
 */

public class Ex05VariableCapture {
    private static String trueString = "True";

    public static void main(String[] args) {
        StringTester stringTester = new StringTester();
        boolean stringTestOutput = stringTester.testString("True", input -> input.equals(trueString));
        System.out.println(stringTestOutput);

        stringTestOutput = stringTester.testString("False", input -> input.equals(trueString));
        System.out.println(stringTestOutput);
    }
}

class StringTester {
    boolean testString (String input, Predicate predicate) {
        return predicate.test(input);
    }
}