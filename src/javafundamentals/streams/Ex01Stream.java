package javafundamentals.streams;

import java.util.stream.Stream;

/**
 * Create an stream of strings with the names of the people in the class
 * Iterate it and print the values.
 */

public class Ex01Stream {
    public static void main(String[] args) {
        Stream<String> countryStream = Stream.of("Germany","England","Spain","Japan");

        countryStream.forEach((element) -> System.out.println(element));
    }
}
