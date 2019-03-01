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

    public static void main(String[] args) {

        String prefix = "CODING nOmAds";

        Check check = new Check();
        Function<String, String> stringStringFunction = (word) -> prefix.concat(word);

        String result = check.modifyThisWord(stringStringFunction, " im roi");

        System.out.println(result);

    }

}

class Check {
    public String modifyThisWord(Function<String,String> function, String word) {

        return function.apply(word);
    }
}
