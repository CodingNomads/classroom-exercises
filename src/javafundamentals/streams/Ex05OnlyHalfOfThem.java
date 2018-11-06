package javafundamentals.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Create an stream with ints from 1 to 100
 * skip the first 10 elements then print the rest
 * Collect the result of the stream into a list.
 */

public class Ex05OnlyHalfOfThem {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        List<Integer> intList = IntStream.rangeClosed(start, end)
                .skip(10)
                .map(i-> {
                    System.out.println(i);
                    return i;
                })
                .boxed()
                .collect(Collectors.toList());
    }
}
