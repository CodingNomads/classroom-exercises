package streams;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Create a stream of 10 random ints.
 * If any of those is a five then print "Found a 5!!"
 * if there are no fives then print "Keep searching..."
 */

public class Ex04Matching {
    public static void main(String[] args) {


        // for loop to test multiple streams.
        for (int i = 0; i < 100000; i++) {
            IntStream randomstream = new Random().ints(10); // create intstream
            String string = randomstream.limit(10).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString(); // limit to 10 random ints,

            if (!string.contains("5")) {
                System.out.println("Keep searching");
                System.out.println(string);
            }

        }
    }
}

