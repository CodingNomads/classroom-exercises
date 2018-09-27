package javafundamentals.arrays;

/**
 * Create an array with the first 20 multiples of 12 and the first 20 multiples of 10.
 * Find the common elements between the 2 arrays and print them
 * */

public class Ex7CommonElements {
    public static void main(String[] args) {
        int[] multiplesOfTwelve = new int[20];
        int[] multiplesOfTen = new int[20];

        for (int i = 0; i < 20; i++) {
            multiplesOfTwelve[i] = (i + 1) * 12;
            multiplesOfTen[i] = (i + 1) * 10;
        }

        for (int i = 0; i < multiplesOfTen.length;i++) {
            for (int j = 0; j < multiplesOfTwelve.length;j++) {
                if (multiplesOfTen[i] == multiplesOfTwelve[j]) {
                    System.out.println(multiplesOfTen[i] + " is a multiple of both 12 and 10");
                }
            }
        }
    }
}
