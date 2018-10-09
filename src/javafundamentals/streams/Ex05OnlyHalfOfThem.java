package javafundamentals.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Create an stream with ints from 1 to 100
 * skip the first 10 elements then print the rest
 * Collect the result of the stream into a list.
 */

public class Ex05OnlyHalfOfThem {
    public static void main(String[] args) {
        List<Integer> integerList = IntStream.rangeClosed(1, 100)
                .skip(10)
                .map(e -> {
                    System.out.println(e);
                    return e;
                })
                .boxed()
                .collect(Collectors.toList());
    }
}
