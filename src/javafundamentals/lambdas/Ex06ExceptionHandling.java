package javafundamentals.lambdas;

import java.util.function.BiFunction;
import java.util.function.Consumer;

/**
 * Create a class that contains a method that accepts a Functional Interface
 * Use this method with a lambda which in its body throws an exception.
 * <p>
 * Manage the exception.
 */

public class Ex06ExceptionHandling {
    public static void main(String[] args) {
        ClassWithException firstInstance = new ClassWithException();
        try {
            firstInstance.divide((a, b) -> (a / b), 3, 0);
            System.out.println("I was able to divide!");
        } catch (ArithmeticException e) {
            System.out.println("There was an exception to the divide method!");
        } finally {
            System.out.println("I'm done trying this now!");
        }
    }
}

class ClassWithException {

    public Integer divide(BiFunction<Integer, Integer, Integer> bi, Integer int1, Integer int2) {
        return bi.apply(int1, int2);
    }

    public Integer divide(Integer x, Integer y) {
        return x * y;
    }
}