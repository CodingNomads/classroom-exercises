package javafundamentals.lambdas;

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
    public static void main(String[] args) {
        Converter converter = new Converter();

        Function<Convertible,String> function = converter::toStringFromInt;

        String convertedOutput = function.apply(input -> Integer.toString(input));



    }
    public void staticMethod(){

    }
}

@FunctionalInterface
interface Convertible {
    String convertToString (Integer input);
}

class Converter {
    String toStringFromInt (Convertible convertible) {
        return convertible.convertToString(44);
    }

   // static
}
