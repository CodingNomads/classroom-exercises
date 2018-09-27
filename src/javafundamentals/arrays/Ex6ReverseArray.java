package javafundamentals.arrays;

/**
 * Create an array with 10 values on it and print the values of the array in the reverse order
 */

public class Ex6ReverseArray {
    public static void main(String[] args) {
        int[] valueArray = new int[10];

        for (int i = 0; i < valueArray.length; i++) {
            valueArray[i] = i;
        }

        for (int i = valueArray.length - 1;i >= 0;i--) {
            System.out.println(valueArray[i]);
        }
    }
}
