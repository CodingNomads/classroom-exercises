package streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Create an stream of ints with values from 1 to 100
 * (tip: there is a nice method inside IntStream)
 * Print the min, max and count from the stream.
 */

public class Ex02StreamSimpleOperations {
    public static void main(String[] args) {
        IntStream.range(1,101).min().ifPresent(System.out::println);
        IntStream.range(1,101).max().ifPresent(System.out::println);
        System.out.println(IntStream.range(1,101).count());

    }
}
