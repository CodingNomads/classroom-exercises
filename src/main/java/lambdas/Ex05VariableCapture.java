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

    String someText = "COdiNg NomaDs";

    public static void main(String[] args) {
        System.out.println(new Aggregate().manipulateData((s) -> s.toString().toLowerCase(), new Ex05VariableCapture().someText));
    }
}

class Aggregate {

    public String manipulateData(Function function, String s) {
        return (String) function.apply(s);
    }

}
