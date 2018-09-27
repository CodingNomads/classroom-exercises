package javafundamentals.arrays;

import java.util.Arrays;

/**
 * Create an array with 10 random numbers (between 0 and 1000) and create a method that sorts them.
 */

public class Ex8SortNumbers {
    public static void main(String[] args) {
        int[] randomArray = new int[10];
        sortArray(createArray(randomArray));
    }

    public static int[] createArray(int[] theArray){
        for (int i = 0; i < 10; i++) {
            theArray[i]= (int)(Math.random()*1000);
            //System.out.println(theArray[i]);
        }
        return theArray;
    }

    public static void sortArray(int[] theArray){
        Arrays.sort(theArray);
        for (int i = 0; i < 10; i++) {
            System.out.println(theArray[i]);
        }
    }




}
