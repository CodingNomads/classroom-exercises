package javafundamentals.arrays;

/**
 * Create an array with 10 random numbers (between 0 and 1000) and create a method that sorts them.
 */

public class Ex8SortNumbers {
    public static void main(String[] args) {
        int[] randomArray = new int[10];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int)(Math.random() * 1000 + 1);
        }

        System.out.println("Original array:");
        for (int i = 0; i < randomArray.length;i++) {
            System.out.println(randomArray[i]);
        }

        int[] sortedArray = sortIntArray(randomArray);

        System.out.println("\nSorted array:");
        for (int i = 0; i < randomArray.length;i++) {
            System.out.println(randomArray[i]);
        }

    }

    static int[] sortIntArray (int[] inputArray) {
        for (int i = 0; i < inputArray.length;i++) {
            for (int j = 0; j < inputArray.length;j++) {
                if (inputArray[i] < inputArray[j]) {
                    int buffer = inputArray[i];

                    inputArray[i] = inputArray[j];
                    inputArray[j] = buffer;
                 }
            }
        }

        return inputArray;
    }
}
