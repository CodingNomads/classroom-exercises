package javafundamentals.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Create an stream oof 100 elements with random values on them.
 * filter the odd ones out and pick only 3 results
 * put them into a List.
 */

public class Ex03StreamsRandom {
    public static void main(String[] args) {

        List<Integer> integerList = new Random().ints(100,0,100)
                .filter((integer) -> integer%2 == 0)
                .limit(3)
                .boxed()
                .collect(Collectors.toList());

        for (Integer integer : integerList) {
            System.out.println(integer);
        }
    }
}
