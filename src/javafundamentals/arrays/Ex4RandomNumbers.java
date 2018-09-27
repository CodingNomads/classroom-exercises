package javafundamentals.arrays;

/**
 * Create an array of random numbers and print the index of the biggest number
 */

public class Ex4RandomNumbers {
    public static void main(String[] args) {
        int[] randomArray = {12,143,654,34,5,76,37,42};

        int biggestNumberIndex = 0;

        for (int i = 0; i < randomArray.length; i++) {
            if(randomArray[i] > randomArray[biggestNumberIndex]) {
                biggestNumberIndex = i;
            }
        }

        System.out.println("The largest is at index " + biggestNumberIndex);
    }
}
