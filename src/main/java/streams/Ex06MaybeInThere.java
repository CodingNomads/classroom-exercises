package streams;

import java.util.Random;

/**
 * Create a list with 10 random elements.
 * Find any element
 * Access secure to the element and if is not there return 0
 * print the result.
 */

public class Ex06MaybeInThere {

    public static void main(String[] args) {
        int random = new Random().ints(10).findAny().orElse(-1);
        System.out.println(random);
    }
}
