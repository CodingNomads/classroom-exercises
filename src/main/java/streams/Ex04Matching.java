package streams;

import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Create a stream of 10 random ints.
 * If any of those is a five then print "Found a 5!!"
 * if there are no fives then print "Keep searching..."
 */

public class Ex04Matching {

    public static void main(String[] args) {
        int number;
        do {
            number = new Random().ints(10).findFirst().orElse(-1);
            System.out.println(number);
            if( number % 5 != 0){
                System.out.println("Keep searching...");
            }
        } while (number % 5 != 0);

        System.out.println("Found a 5!");
    }
}
