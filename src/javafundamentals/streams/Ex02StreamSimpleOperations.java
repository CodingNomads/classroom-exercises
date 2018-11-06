package javafundamentals.streams;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Create an stream of ints with values from 1 to 100
 * (tip: there is a nice method inside IntStream)
 * Print the min, max and count from the stream.
 */

public class Ex02StreamSimpleOperations {
    public static void main(String[] args) {
        Integer start = 1;
        Integer end = 100;
        IntStream myStream = IntStream.rangeClosed(start, end);
        myStream.forEach(System.out::println);
    }
}
