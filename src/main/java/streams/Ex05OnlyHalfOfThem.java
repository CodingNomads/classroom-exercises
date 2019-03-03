package streams;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Create an stream with ints from 1 to 100
 * skip the first 10 elements then print the rest
 * Collect the result of the stream into a list.
 */

public class Ex05OnlyHalfOfThem {

    public static void main(String[] args) {


        IntStream randomstream = IntStream.rangeClosed(1, 100);
        randomstream.skip(10).boxed().collect(Collectors.toList()).forEach(System.out::println);
    }
}
