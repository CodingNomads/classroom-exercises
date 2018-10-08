package javafundamentals.lambdas;

/**
 * Create one functional interface with only one method.
 * Create a class with one method that accepts as a parameter the interface you created before
 * <p>
 * Create a lambda and pass it to the method from the class that accept the functional interface.
 */

public class Ex02LambdaWithFunctionalInterface {
    public static void main(String[] args) {

        Ex2ClassWithMethod classWithMethod = new Ex2ClassWithMethod();

        classWithMethod.going((name) -> System.out.println(name + " is overriding the going method!"), "Andrea");


    }
}