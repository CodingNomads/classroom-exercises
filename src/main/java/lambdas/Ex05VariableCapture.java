package lambdas;

/**
 * Create a class that contains a method that accepts a Functional Interface
 * Create a field in this class Ex05VariableCapture
 * Create the psvm main method in this class: Ex05VariableCapture
 * <p>
 * Create a lambda and pass it to the method that accepts a functional interface.
 * Use the field from Ex05VariableCapture in the body of the lambda.
 */

public class Ex05VariableCapture {

    String concat(Change change, String string1, String string2){
        return change.concat(string1, string2);
    }

    public static void main(String[] args) {
        String string1 = "Coding";

        Change change = String::concat,str1,str2;

        String result = change.concat(string1,"nomads");

        System.out.println(result);

    }
}

class StringUtil implements Change{
    public String concat(String string1, String string2){
        return string1.concat(string2);
    }
}

interface Change{
    String concat (String string1, String string2);

}