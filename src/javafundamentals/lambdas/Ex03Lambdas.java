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
        String name = "Arnold";

        Tester tester = new Tester();

        System.out.println(name);

        tester.andyTest(inputName -> inputName == "Andy",name);

        name = tester.makeAndy(inputName -> {
            inputName = "Andy";
            return inputName;
        },name);

        System.out.println(name);
        tester.andyTest(inputName -> inputName == "Andy",name);

    }
}
class Tester {
    public void andyTest(Predicate<String> predicate,String inputName) {
        if (predicate.test(inputName)) {
            System.out.println("It is Andy");
        } else {
            System.out.println("It is not Andy");
        }
    }

    public String makeAndy(Function<String,String> function,String inputName) {
        return function.apply(inputName);
    }
}
