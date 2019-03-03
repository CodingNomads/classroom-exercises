package streams;

import java.util.stream.*;
import java.util.Random;

/**
 * Create a stream of 10 random ints.
 * If any of those is a five then print "Found a 5!!"
 * if there are no fives then print "Keep searching..."
 */

public class Ex04Matching {
    public static void main(String[] args) {

        Random random = new Random();

        boolean status = false;

        while(!status){

            status = Stream.generate(() -> random.nextInt(1000)).limit(10).anyMatch(val -> val == 5);

            System.out.println("Keep Searching");
        }

        System.out.println("Found a  5");
    }
}
