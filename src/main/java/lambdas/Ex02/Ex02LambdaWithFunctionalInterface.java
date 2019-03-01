package lambdas.Ex02;

/**
 * Create one functional interface with only one method.
 * Create a class with one method that accepts as a parameter the interface you created before
 * <p>
 * Create a lambda and pass it to the method from the class that accept the functional interface.
 */

public class Ex02LambdaWithFunctionalInterface {
    public static void main(String[] args) {

        screamIt(() -> System.out.println("AHHHHHHH!"));
        screamIt(() -> System.out.println("OH"));

    }

    public static void screamIt(Contract contract) {
        contract.yell();
        System.out.println("otro grito");
    }
}