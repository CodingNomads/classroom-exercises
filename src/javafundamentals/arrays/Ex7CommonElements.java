package javafundamentals.arrays;

/**
 * Create an array with the first 20 multiples of 12 and the first 20 multiples of 10.
 * Find the common elements between the 2 arrays and print them
 */

public class Ex7CommonElements {
    public static void main(String[] args) {
        int[] mult10 = new int[20];
        fillArray(mult10, 10);
        int[] mult12 = new int[20];
        fillArray(mult12, 12);
        compareArrays(mult10, mult12);
    }

    public static void fillArray(int[] mult, int multiplier) {
        for (int x = 1; x < 20; x++) {
            mult[(x - 1)] = x * multiplier;
            //System.out.println(mult[x - 1]);
        }
    }

    public static void compareArrays(int[] firstArray, int[] secondArray) {
        for (int i = 0; i < firstArray.length; i++) {
            for (int y = 0; y < secondArray.length; y++) {
                if (secondArray[y] == firstArray[i]) {
                    System.out.println(secondArray[y]);
                }
            }
        }
    }
}
