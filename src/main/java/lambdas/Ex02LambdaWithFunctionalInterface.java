package lambdas;

/**
 * Create one functional interface with only one method.
 * Create a class with one method that accepts as a parameter the interface you created before
 * <p>
 * Create a lambda and pass it to the method from the class that accept the functional interface.
 */

public class Ex02LambdaWithFunctionalInterface {
    public static void main(String[] args) {
        Ex02Interface isEqual = (a,b) -> (a == b);

        if(isEqual.test(10,10)) {
            System.out.println("equal");
        }

        if(!isEqual.test(10,5)) {
            System.out.println("not equal");
        }
    }
}