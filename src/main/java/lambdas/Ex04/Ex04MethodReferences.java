package lambdas.Ex04;

import java.util.function.BiPredicate;

/**
 * Create Class1 that contains a method that accepts a Functional Interface
 * Create Class2 with 2 methods with the same signature as the functional interface:
 * method1 is static
 * method2 is non-static,
 * <p>
 * Call method1 from class1 using a method reference
 * Call method2 from class1 using a method reference
 */

class Compare {

    public static void main(String[] args) {
        System.out.println(AnotherCompare.isMoreThan((num1,num2) -> num1 > num2));
    }
    
    public boolean isMoreThan(BiPredicate<Integer,Integer> biPredicate,Integer num1,Integer num2) {
        return biPredicate.test(num1,num2);
    }
}

class AnotherCompare {

    public static boolean isMoreThan(BiPredicate<Integer,Integer> biPredicate) {
        return biPredicate.test(30,20);
    }

}



