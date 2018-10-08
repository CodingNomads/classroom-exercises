package javafundamentals.lambdas;

import java.util.function.BiFunction;

/**
 * Create a class calculator that has only one method that uses a BiFunction<T, U, R>.
 * Create variables with lambdas that contain the 4 main operations (+, -, *, /)
 * <p>
 * Use the calculator with the lambdas to make operations.
 */

public class Ex07CalculatorWithLambdas {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        BiFunction<Integer, Integer, Integer> divider = (x, y) -> x / y;
        BiFunction<Integer, Integer, Integer> multiplier = (x, y) -> x * y;
        BiFunction<Integer, Integer, Integer> adder = (x, y) -> x + y;
        BiFunction<Integer, Integer, Integer> subtractor = (x, y) -> x - y;

        int firstNumber = 14;
        int secondNumber = 2;

        System.out.println(firstNumber + " / " + secondNumber + " = " +
                calculator.calculate(firstNumber, secondNumber, divider));

        System.out.println(firstNumber + " * " + secondNumber + " = " +
                calculator.calculate(firstNumber, secondNumber, multiplier));

        System.out.println(firstNumber + " + " + secondNumber + " = " +
                calculator.calculate(firstNumber, secondNumber, adder));

        System.out.println(firstNumber + " - " + secondNumber + " = " +
                calculator.calculate(firstNumber, secondNumber, subtractor));

    }
}

class Calculator {
    int calculate(int x, int y, BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(x, y);
    }
}
