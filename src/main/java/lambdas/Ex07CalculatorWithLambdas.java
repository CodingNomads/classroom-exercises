package lambdas;

import java.util.function.BiFunction;

/**
 * Create a class calculator that has only one method that uses a BiFunction<T, U, R>.
 * Create variables with lambdas that contain the 4 main operations (+, -, *, /)
 *
 * Use the calculator with the lambdas to make operations.
 */

public class Ex07CalculatorWithLambdas {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        int sum = add.apply(10,5);

        System.out.println(sum);

        BiFunction<Integer, Integer, Integer> sub = (a, b) -> a - b;

        sum = sub.apply(50, 5);

        System.out.println(sum);

        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;

        sum = multiply.apply(8,10);

        System.out.println(sum);

        BiFunction<Double, Double, Double> divide = (a, b) -> a / b;

        double result = divide.apply(90.0,7.0);

        System.out.println(result);


    }


}

