package javafundamentals.streams;

import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Create a list with 10 random elements.
 * Find any element
 * Access secure to the element and if is not there return 0
 * print the result.
 */

public class Ex06MaybeInThere {
    public static void main(String[] args) {
        IntStream randomStream = new Random().ints(10, 1, 10);
        OptionalInt any = randomStream.findAny();
        any.ifPresent(i-> System.out.println(i));
        any.orElse(0);
    }
}
