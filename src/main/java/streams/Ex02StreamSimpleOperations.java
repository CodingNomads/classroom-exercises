package streams;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.*;
import java.util.stream.IntStream;

/**
 * Create an stream of ints with values from 1 to 100
 * (tip: there is a nice method inside IntStream)
 * Print the min, max and count from the stream.
 */

public class Ex02StreamSimpleOperations {
    public static void main(String[] args) {

        IntStream.range(1,101).forEach(val-> System.out.print(val + " "));

        System.out.println();

        OptionalInt max = IntStream.range(1,101).max();

        if(max.isPresent())
            System.out.println(max.getAsInt());

        OptionalInt min = IntStream.range(1,101).min();

        if(min.isPresent())
            System.out.println(min.getAsInt());
    }
}
