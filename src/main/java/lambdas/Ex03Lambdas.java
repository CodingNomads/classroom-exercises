package lambdas;

import java.util.function.Predicate;

/**
 * Create a class with 2 methods.
 * One accepts a Predicate and another that accepts a function
 * <p>
 * Use anonymous classes to pass to those methods
 * Replace them with lambdas
 */

public class Ex03Lambdas {
    public static void main(String[] args) {

        int val = 5;


    }
}

class Check{
    public static boolean validate(Predicate<Integer> predicate, int val){
        return predicate.test(val);
    }
}
