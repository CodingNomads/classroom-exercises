package javafundamentals.lambdas;

import java.util.function.Function;

/**
 * Create a class that contains a method that accepts a Functional Interface
 * Use this method with a lambda which in its body throws an exception.
 *
 * Manage the exception.
 */

public class Ex06ExceptionHandling {
    public static void main(String[] args) {
        Squarer squarer = new Squarer();

        try {
            squarer.square(14, input -> {
                if (input < (Integer.MAX_VALUE / Integer.MAX_VALUE)) {
                    return input * input;
                } else {
                    throw new RuntimeException();
                }
            });
        } catch (RuntimeException e) {
            System.out.println("Input too large for Integer type");
        }

    }
}

class Squarer {
    int square (int x, Function<Integer,Integer> function) {
        return function.apply(x);
    }
}