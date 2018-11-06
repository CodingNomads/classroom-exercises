package javafundamentals.streams;

import java.util.*;

import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 * Create an stream oof 100 elements with random values on them.
 * filter the odd ones out and pick only 3 results
 * put them into a List.
 */

public class Ex03StreamsRandom {
    public static void main(String[] args) {
        IntStream randomStream = new Random().ints(50, 0, 100);
        List<Integer> newList = randomStream.filter(i -> i % 2 != 0)
                .limit(3)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(newList);
    }
}


