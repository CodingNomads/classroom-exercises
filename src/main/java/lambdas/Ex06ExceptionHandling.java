package lambdas;

import java.util.function.Function;

/**
 * Create a class that contains a method that accepts a Functional Interface
 * Use this method with a lambda which in its body throws an exception.
 *
 * Manage the exception.
 */

public class Ex06ExceptionHandling {

   public static int divide(Function<Integer, Integer> calculate, int x, int y){
       int newX = calculate.apply(x);
       return newX / y;
   }

    public static void main(String[] args) {

       Function<Integer, Integer> calculateX = (x) -> x * 2;

       try{
           divide(calculateX,4,0);
       } catch (ArithmeticException err){
           System.out.println("Arithmetic error: " + err);
       }

    }



}
