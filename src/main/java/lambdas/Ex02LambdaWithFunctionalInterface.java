package lambdas;

import java.util.Scanner;

/**
 * Create one functional interface with only one method.
 * Create a class with one method that accepts as a parameter the interface you created before
 * <p>
 * Create a lambda and pass it to the method from the class that accept the functional interface.
 */

public class Ex02LambdaWithFunctionalInterface {
    public static void main(String[] args) {

        Control control = (str1, str2) -> str1.equalsIgnoreCase(str2);

        boolean result = control.areSame("OutPOST", "OUTpost");

        System.out.println(result);
    }

}

interface Control{
    boolean areSame(String string1, String string2);
}