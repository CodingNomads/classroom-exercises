package streams;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * Create a stream of 10 random ints.
 * If any of those is a five then print "Found a 5!!"
 * if there are no fives then print "Keep searching..."
 */

public class Ex04Matching {
    public static void main(String[] args) {
        IntStream myStream = new Random().ints(10,1,10);

        myStream.forEach((n) -> {
            if (n == 5) {
                System.out.println("Found a " + n);
            } else {
                System.out.println("Keep searching...");
            }
        });
    }
}
