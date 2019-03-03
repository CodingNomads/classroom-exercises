package lambdas;

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

public class Ex04MethodReferences {

    public static void functionalInterfaceMethod(Function<Integer, Integer> function, int a){
        function.apply(a);
    }

    public static void main(String[] args) {
        Ex04Methods.method1((b) -> b * b,2);

        Ex04Methods useMethod2 = new Ex04Methods();


    }

}

class Ex04Methods{

    public static void method1(Function<Integer, Integer> function1, int b){
        System.out.println(function1.apply(b));
    }

    public void method2(Function<Integer, Integer> function2, int c){
        function2.apply(c);
    }
}
