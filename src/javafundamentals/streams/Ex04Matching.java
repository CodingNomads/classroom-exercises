package javafundamentals.streams;

import java.util.OptionalInt;
import java.util.Random;


/**
 * Create a stream of 10 random ints.
 * If any of those is a five then print "Found a 5!!"
 * if there are no fives then print "Keep searching..."
 */

public class Ex04Matching {
    public static void main(String[] args) {
        OptionalInt randomStream = new Random().ints(10, 0, 10)
                .filter(i -> i == 5)
                .findFirst();
        if (randomStream.isPresent()){
            System.out.println("Found a 5!!");
        }
        else{
            System.out.println("Keep searching...");
        }

    }
}
