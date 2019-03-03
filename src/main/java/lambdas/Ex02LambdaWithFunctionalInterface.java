package lambdas;

/**
 * Create one functional interface with only one method.
 * Create a class with one method that accepts as a parameter the interface you created before
 * <p>
 * Create a lambda and pass it to the method from the class that accept the functional interface.
 */

public class Ex02LambdaWithFunctionalInterface {

    public static void main(String[] args) {

        Ex02_Interface<Integer> calculation = (a) -> (a * a);
        calcSquare(calculation,2);

    }

    public static void calcSquare(Ex02_Interface<Integer> square, int a){
        int result = square.calculate(a);
        System.out.println(result);
    }
}