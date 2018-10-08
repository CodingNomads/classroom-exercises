package javafundamentals.lambdas;

import java.util.function.Consumer;

/**
 * Create a class that contains a method that accepts a Functional Interface
 * Create a field in this class Ex05VariableCapture
 * Create the psvm main method in this class: Ex05VariableCapture
 * <p>
 * Create a lambda and pass it to the method that accepts a functional interface.
 * Use the field from Ex05VariableCapture in the body of the lambda.
 */

public class Ex05VariableCapture {
    static String myName = "Andrea";
    public static void main(String[] args) {
       MyMethod methodOne = new MyMethod();
       Consumer<String> firstConsumer = o -> System.out.println(o + myName + " is here!");
       methodOne.myMethod(firstConsumer, "Hello");
    }
}

class MyMethod{
    void myMethod(Consumer myConsumer, String name){
        myConsumer.accept(name);
    }
}