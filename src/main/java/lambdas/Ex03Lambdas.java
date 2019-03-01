package lambdas;

import java.io.StringWriter;
import java.util.function.Predicate;

/**
 * Create a class with 2 methods.
 * One accepts a Predicate and another that accepts a function
 * <p>
 * Use anonymous classes to pass to those methods
 * Replace them with lambdas
 */

public class Ex03Lambdas {

    public boolean someMethod(int num) {


    }

    public static void main(String[] args) {
        new Thread(new Predicate() {
            @Override
            public boolean test(Object o) {
                return false;
            }
        };

    }
}