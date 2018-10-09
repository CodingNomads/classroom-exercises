package javafundamentals.streams;

import java.util.Random;

/**
 * Create a stream of 10 random ints.
 * If any of those is a five then print "Found a 5!!"
 * if there are no fives then print "Keep searching..."
 */

public class Ex04Matching {
    public static void main(String[] args) {
        boolean fiveFound = new Random().ints(10,0,100)
                .anyMatch(number -> number == 5);

        if (fiveFound) {
            System.out.println("Found a 5!!");
        } else {
            System.out.println("Keep searching...");
        }
    }
}
