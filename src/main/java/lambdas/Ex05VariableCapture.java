package lambdas;

import java.util.function.Function;

/**
 * Create a class that contains a method that accepts a Functional Interface
 * Create a field in this class Ex05VariableCapture
 * Create the psvm main method in this class: Ex05VariableCapture
 * <p>
 * Create a lambda and pass it to the method that accepts a functional interface.
 * Use the field from Ex05VariableCapture in the body of the lambda.
 */

public class Ex05VariableCapture {

    static int num;

    public static void main(String[] args) {
        Function<Integer, Integer> calculate = (num) -> num * 2;
        Ex05Method.method(calculate,8);
    }
}

class Ex05Method{

    public static void method(Function<Integer,Integer> function, int a){
        System.out.println(function.apply(a));
    }

}
