package streams;


import java.util.stream.IntStream;


/**
 * Create an stream of ints with values from 1 to 100
 * (tip: there is a nice method inside IntStream)
 * Print the min, max and count from the stream.
 */

public class Ex02StreamSimpleOperations {

    public static void main(String[] args) {

        IntStream stream = IntStream.rangeClosed(1, 100);
        IntStream stream1 = IntStream.rangeClosed(1, 100);
        IntStream stream2 = IntStream.rangeClosed(1, 100);
        IntStream stream3 = IntStream.rangeClosed(1, 100);


        stream.forEach(System.out::println);

        System.out.println(stream1.max().getAsInt());
        System.out.println(stream2.min().getAsInt());
        long total = stream3.count();
        System.out.println(total);
    }
}
