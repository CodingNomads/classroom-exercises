package streams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Create an stream oof 100 elements with random values on them.
 * filter the odd ones out and pick only 3 results
 * put them into a List.
 */

public class Ex03StreamsRandom {
    public static void main(String[] args) {
        IntStream myRandomStream = new Random().ints(100,1,982);

        int[] myList = myRandomStream.filter((n) -> n % 2 != 0).limit(3).toArray();

        Arrays.stream(myList).forEach(System.out::println);
    }
}
