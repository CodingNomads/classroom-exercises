package javafundamentals.lambdas;

import java.util.function.Function;
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
        //with anonymous method
        Predicate predicate = new Predicate() {
            @Override
            public boolean test(Object o) {
                return o.equals("Java");
            }
        };
        System.out.println(predicate.test(true));

        //now with lambda
        Predicate predicate2 = (o) -> {
            return o.equals("java");
        };
        System.out.println(predicate2.test(true));
        //with anonymous method
        Function function = new Function() {
            @Override
            public Object apply(Object o) {
                return null;
            }
        };
        System.out.println(function.apply(3));

        //now with lambda
        Function function2 = (n) -> null;

        System.out.println(function2.apply(5));
    }
}
