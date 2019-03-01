package lambdas;

import java.util.function.BiFunction;

/**
 * Create Class1 that contains a method that accepts a Functional Interface
 * Create Class2 with 2 methods with the same signature as the functional interface:
 * method1 is static
 * method2 is non-static,
 * <p>
 * Call method1 from class1 using a method reference
 * Call method2 from class1 using a method reference
 */

public class Ex04MethodReferences {
    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperation();
        Class2 class2 = new Class2();

        System.out.println(mathOperation.operate(Class2::multiply,5,20));

        System.out.println(mathOperation.operate(class2::divide,500,20));


        System.out.println(mathOperation.operate((val1, val2) -> val1 * val2,500,20));
        System.out.println(mathOperation.operate((val1, val2) -> val1 / val2, 300, 20));


    }
}

class Class2 {
    public static int multiply(int val1, int val2) {
        return val1 * val2;
    }

    public int divide(int val1, int val2) {
        return val1 / val2;
    }

}

class MathOperation {
    public int operate(BiFunction<Integer, Integer, Integer> biFunction, int val1, int val2) {
        return biFunction.apply(val1, val2);
    }
}



