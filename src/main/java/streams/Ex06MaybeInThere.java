package streams;

import java.util.Optional;
import java.util.Random;
import java.util.stream.*;

/**
 * Create a list with 10 random elements.
 * Find any element
 * Access secure to the element and if is not there return 0
 * print the result.
 */

public class Ex06MaybeInThere {
    public static void main(String[] args) {

        Random random = new Random();

        Optional<Integer> number = Stream.generate(()-> random.nextInt()).limit(10).findAny();

        if(number.isPresent()){
            System.out.println(number.get());
        }
        else{
            System.out.println(0);
        }
    }
}
