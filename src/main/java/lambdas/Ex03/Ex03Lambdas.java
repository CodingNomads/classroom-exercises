package lambdas.Ex03;

import java.util.function.Predicate;

/**
 * Create a class with 2 methods.
 * One accepts a Predicate and another that accepts a function
 * <p>
 * Use anonymous classes to pass to those methods
 * Replace them with lambdas
 */

public class Ex03Lambdas {
    public static void main(String[] args) {

        System.out.println(new Activity().evaluateNumber((Predicate<Integer>) number -> number % 2 == 0,4));

        System.out.println(new Activity().divideANumber( divideByHalf -> divideByHalf, 10.0) / 2);

    }
}
