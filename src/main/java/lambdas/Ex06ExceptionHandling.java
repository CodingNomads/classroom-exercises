package lambdas;

import java.util.function.BinaryOperator;

/**
 * Create a class that contains a method that accepts a Functional Interface
 * Use this method with a lambda which in its body throws an exception.
 *
 * Manage the exception.
 */

public class Ex06ExceptionHandling {
    public static void main(String[] args) {

        String crazyLambdaWorld = new MakeItFun().transform((s1, s2) -> {
            if (s1 == "this couLd") {
                try {
                    throw new InterruptedException("Throwing like a baseball");
                } catch (InterruptedException exc) {
                    return "I caught it even though I threw it for no reason at all " + exc;
                }
            }
            return s1.toString().toLowerCase().concat(s2.toString().toUpperCase());
        }, "this couLd", "be funner");

        System.out.println(crazyLambdaWorld);

    }
}

class MakeItFun {

    String transform(BinaryOperator binaryOperator, String s1, String s2) {
        return (String) binaryOperator.apply(s1,s2);
    }

}
