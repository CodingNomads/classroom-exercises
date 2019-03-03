package streams;

import java.util.stream.*;
import java.util.List;

/**
 *  Create an stream with ints from 1 to 100
 *  skip the first 10 elements then print the rest
 *  Collect the result of the stream into a list.
 */

public class Ex05OnlyHalfOfThem {
    public static void main(String[] args) {

        List<Integer> list = IntStream.range(1,101).skip(10).boxed().collect(Collectors.toList());

        System.out.println(list);
    }
}
