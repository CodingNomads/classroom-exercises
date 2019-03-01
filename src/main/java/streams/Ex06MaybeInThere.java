package streams;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Create a list with 10 random elements.
 * Find any element
 * Access secure to the element and if is not there return 0
 * print the result.
 */

public class Ex06MaybeInThere {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc1", "abc2", "abc3");
//        long count = list.stream()
//                .filter(element -> {
//                    System.out.println("being called!!!!");
//                    return element.contains("2");
//                })
//                .count();


        List<String> list2 = Arrays.asList("abc1", "abc2", "abc3");

//        System.out.println(count);
        //////
//        Optional<String> optional = list2.stream()
//                .filter(element -> {
//                    System.out.println("filter() was called");
//                    return element.contains("6");
//                }).map(element -> {
//                    System.out.println("map() was called");
//                    return element.toUpperCase();
//                }).findFirst();
//
//       // optional.ifPresent(System.out::println);
//        System.out.println(optional.orElse("There was nothing men!"));

        int reduced =
                IntStream.range(1, 4)
                        .reduce(2,(a, b) -> a * b);

        System.out.println(reduced);

//        reduced.ifPresent(System.out::println);

    }


}
