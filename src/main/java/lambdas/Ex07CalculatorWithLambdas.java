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

       BiFunction<Integer, Integer, Integer> multiply = (x, y) -> x * y;
       BiFunction<Integer, Integer, Integer> divide = (x, y) -> x / y;
       BiFunction<Integer, Integer, Integer> plus = (x, y) -> x + y;
       BiFunction<Integer, Integer, Integer> minus = (x, y) -> x - y;

       Calculator.calculator(multiply, 8, 4);
        Calculator.calculator(divide, 8, 4);
        Calculator.calculator(plus, 8, 4);
        Calculator.calculator(minus, 8, 4);

    }
}

class Calculator{

    public static int calculator(BiFunction<Integer, Integer, Integer> operator, int x, int y){
        int result = operator.apply(x, y);
        System.out.println(result);
        return result;
    }
}
