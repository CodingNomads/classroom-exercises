package lambdas.Ex04;


import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Create Class1 that contains a method that accepts a Functional Interface
 * Create Class2 with 2 methods with the same signature as the functional interface:
 * method1 is static
 * method2 is non-static,
 * <p>
 * Call method1 from class1 using a method reference
 * Call method2 from class1 using a method reference
 */

class Calculation {

    public static void main(String[] args) {
        Integer multiplication = new Calculation().count(Operation::multiplyNumbers,10,20);
        Integer addition = new Calculation().count(new Operation()::sumNumbers, 10, 20);

        System.out.println(multiplication);
        System.out.println(addition);
    }

    public Integer count (BiFunction<Integer, Integer, Integer> function, Integer num1, Integer num2) {
        return function.apply(num1,num2);
    }
}

class Operation {

    public static Integer multiplyNumbers (Integer num1,Integer num2) {
        return num1 * num2;
    }

    public Integer sumNumbers (Integer num1,Integer num2) {
        return num1 + num2;
    }
}

