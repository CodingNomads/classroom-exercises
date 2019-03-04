package streams;

import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Create an stream oof 100 elements with random values on them.
 * filter the odd ones out and pick only 3 results
 * put them into a List.
 */

public class Ex03StreamsRandom {

    public static void main(String[] args) {
        List<Integer> oddNumbers = new Random().ints(100).filter(num -> num % 2 != 0).limit(3).boxed().collect(Collectors.toList());
        System.out.println(oddNumbers);

    }
}
