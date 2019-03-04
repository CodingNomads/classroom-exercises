package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Create an stream of ints with values from 1 to 100
 * (tip: there is a nice method inside IntStream)
 * Print the min, max and count from the stream.
 */

public class Ex02StreamSimpleOperations {

    public static void main(String[] args) {

        System.out.println(IntStream.range(0, 101).max().orElse(-1));
        System.out.println(IntStream.range(0, 101).min().orElse(-1));
        System.out.println(IntStream.range(0, 101).count());

    }

}
