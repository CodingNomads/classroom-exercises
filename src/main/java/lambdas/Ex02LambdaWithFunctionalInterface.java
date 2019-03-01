package lambdas;

/**
 * Create one functional interface with only one printIfIsEqual.
 * Create a class with one printIfIsEqual that accepts as a parameter the interface you created before
 * <p>
 * Create a lambda and pass it to the printIfIsEqual from the class that accept the functional interface.
 */

public class Ex02LambdaWithFunctionalInterface {
    public static void main(String[] args) {
        EqualTester equalTester = (a, b) -> a == b;
        printIfIsEqual(equalTester,5,9);
        printIfIsEqual(equalTester,5,5);
        addIfNotEqual(equalTester, 1337,100);
    }

    private static void printIfIsEqual(EqualTester tester, int a, int b){
        if (tester.areEqual(a,b)) {
            System.out.println("Numbers are equal");
        }
    }

    private static void addIfNotEqual(EqualTester tester, int a, int b) {
        if (!tester.areEqual(a,b)) {
            System.out.println(a + b);
        }
    }
}