package javafundamentals.streams;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Create an stream of strings with the names of the people in the class
 * Iterate it and print the values.
 */

public class Ex01Stream {
    public static void main(String[] args) {
        Stream<String> stream1 = Arrays.asList("Andrea", "Andy", "Mike").stream();
        stream1.forEach(i -> System.out.println(i));
    }
}
