package javafundamentals.lambdas;

import java.util.function.BiFunction;

/**
 * Create a class calculator that has only one method that uses a BiFunction<T, U, R>.
 * Create variables with lambdas that contain the 4 main operations (+, -, *, /)
 *
 * Use the calculator with the lambdas to make operations.
 */

public class Ex07CalculatorWithLambdas {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.calculator((a, b)->(a*b), 4, 5));
        System.out.println(myCalculator.calculator((a, b )-> (a/b), 4, 5));
        System.out.println(myCalculator.calculator((a, b)-> (a+b), 4, 5));
        System.out.println(myCalculator.calculator((a, b)-> (a-b), 4, 5));
    }
}

class Calculator{
    public Integer calculator(BiFunction<Integer, Integer, Integer> biFunction, Integer int1, Integer int2){
        return biFunction.apply(int1, int2);
    }
}