package javafundamentals.arrays;

/**
 * Create an array with 10 values on it and print the values of the array in the reverse order
 */

public class Ex6ReverseArray {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int x=9; x>=0; x--){
            System.out.println(myArray[x]);
        }
    }
}
