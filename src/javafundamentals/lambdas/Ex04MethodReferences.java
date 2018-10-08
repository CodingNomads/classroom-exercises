package javafundamentals.lambdas;

import java.util.function.Consumer;

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
        Class1 firstInstance = new Class1();

        Class2 instanceOfClass2 = new Class2();

        firstInstance.myMethod(Class2::staticAccept, "Bob");

        firstInstance.myMethod(instanceOfClass2::nonStaticAccept, "Emily");

        firstInstance.myMethod(System.out::println, "Hello");



    }
}

class Class1 {
    void myMethod(Consumer<String> myConsumer, String name) {
        myConsumer.accept(name);
    }
}

class Class2 {
    static void staticAccept(String t){
        System.out.println("This is the static accept for: " + t);
    };
    void nonStaticAccept(String t){
        System.out.println("This is the NON-static accept for: " + t);

    };
}
