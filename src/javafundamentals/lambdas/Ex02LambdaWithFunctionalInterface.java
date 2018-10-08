package javafundamentals.lambdas;

/**
 * Create one functional interface with only one method.
 * Create a class with one method that accepts as a parameter the interface you created before
 * <p>
 * Create a lambda and pass it to the method from the class that accept the functional interface.
 */

public class Ex02LambdaWithFunctionalInterface {
    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.printText("Hello", input -> System.out.println(input));
    }
}

interface Printable {
    void print(String s);
}

class Printer {
    public void printText(String s, Printable printable) {
        printable.print(s);
    }
}