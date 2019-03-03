package streams;

import java.util.List;
import java.util.stream.*;
import java.util.Random;

/**
 * Create an stream of 100 elements with random values on them.
 * filter the odd ones out and pick only 3 results
 * put them into a List.
 */

public class Ex03StreamsRandom {
    public static void main(String[] args) {

        Random random = new Random();

        List<Integer> numbers = Stream
                .generate(()-> random.nextInt())
                .limit(100)
                .filter(val-> val % 2 != 0)
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(numbers);
    }
}
