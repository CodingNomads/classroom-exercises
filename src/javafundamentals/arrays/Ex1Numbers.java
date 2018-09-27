package javafundamentals.arrays;

/**
 * Create an array with 100 consecutive numbers starting from 0.
 * Change all the odd numbers for the previous even number so that the input:
 * 0 1 2 3 4 5
 * would have the output:
 * 0 0 2 2 4 4
 * */
public class Ex1Numbers {
    public static void main(String[] args) {
        int[] numberArray = new int[100];

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i;
            System.out.println(numberArray[i]);
        }

        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] % 2 != 0) {
                numberArray[i] = numberArray[i-1];
            }
            System.out.println(numberArray[i]);
        }
    }
}
