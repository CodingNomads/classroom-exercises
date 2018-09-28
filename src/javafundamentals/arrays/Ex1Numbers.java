package javafundamentals.arrays;

import java.util.Arrays;

/**
 * Create an array with 100 consecutive numbers starting from 0.
 * Change all the odd numbers for the previous even number so that the input:
 * 0 1 2 3 4 5
 * would have the output:
 * 0 0 2 2 4 4
 */

public class Ex1Numbers {

    public static void main(String[] args) {

        int[] array1 = new int[100];
        int number;

        for (number = 0; number < 100; number++) {
            array1[number] = number;
        }

        for (number = 0; number < 100; number++) {
            if (number % 2 != 0) {
                array1[number] = number - 1;
            }
        }

        System.out.println(Arrays.toString(array1));


    }
}
