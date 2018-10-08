package javafundamentals.lambdas;

import java.util.function.Predicate;

/**
 * Create Class1 that contains a method that accepts a Functional Interface
 * Create Class2 with 2 methods with the same signature as the functional interface:
 * method1 is static
 * method2 is non-static,
 * <p>
 * Call method1 from class1 using a method reference
 * Call method2 from class1 using a method reference
 */

public class Ex04MethodReferences {
    public static void main(String[] args) {

        FiveComparer fiveComparer = new FiveComparer();

        int numberToTest = 4;

        System.out.println("Is " + numberToTest + " greater than five? " +
                NumberTester.testNumber(numberToTest, FiveComparer::isGreaterThanFive));

        numberToTest = 6;

        System.out.println("Is " + numberToTest + " smaller than five? " +
                NumberTester.testNumber(numberToTest, fiveComparer::isSmallerThanFive));
    }
}

class NumberTester {
    static boolean testNumber(Integer input, Predicate<Integer> predicate) {
        return predicate.test(input);
    }
}

class FiveComparer {
    static boolean isGreaterThanFive(Integer input) {
        return input > 5;
    }

    boolean isSmallerThanFive(Integer input) {
        return input < 5;
    }
}
