package javafundamentals.streams;

import java.util.List;
import java.util.OptionalInt;
import java.util.Random;

/**
 * Create a stream with 10 random elements.
 * Find any element
 * Access secure to the element and if is not there return 0
 * print the result.
 */

public class Ex06MaybeInThere {
    public static void main(String[] args) {
        OptionalInt optionalInt = new Random().ints(10, 0, 100)
                .findAny();

        System.out.println(optionalInt.orElse(0));
    }
}
