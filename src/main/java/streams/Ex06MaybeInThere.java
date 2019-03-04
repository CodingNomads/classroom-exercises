package streams;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Create a list with 10 random elements.
 * Find any element
 * Access secure to the element and if is not there return 0
 * print the result.
 */

public class Ex06MaybeInThere {


    public static void main(String[] args) {

        for (int i = 0; i < 10000; i++) {

            IntStream randomstream = new Random().ints(10);
            List<Integer> randomlist = randomstream.boxed().collect(Collectors.toList());
            Optional<Integer> test = randomlist.stream().filter(x -> x > 1000000000).findAny();
            System.out.println(test.orElse(0));

        }
    }
}
