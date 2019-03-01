package lambdas;

import java.util.Scanner;

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

    static int calculate(Operation operation, int val1, int val2){
       return operation.operate(val1, val2);
    }

    int mod(Operation operation, int val1, int val2){
        return operation.operate(val1, val2);
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter Number1");
        int val1 = keyboard.nextInt();

        System.out.println("Enter Number2");
        int val2 = keyboard.nextInt();

        //Static method

        int result = calculate(MathUtil::add,val1, val2);

        System.out.println(result);

        //Non Static Method

        Operation operation = MathUtil::mod,number1, number2;

        result = operation.operate(val1,val2);

        System.out.println(result);





    }
}

class MathUtil{
    public static int add(int val1, int val2){
        return val1 + val2;
    }

    public static int mod(int val1, int val2){
        return val1 % val2;
    }
}

interface Operation{
    int operate(int val1, int val2);
}