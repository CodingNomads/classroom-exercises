package javafundamentals.collections.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a List with numbers from 1 to 10.
 * Print the sum of all the values in the list.
 */

public class Ex02Iterate {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            integerList.add(i);
        }

        int total = 0;
        for (int i:
             integerList) {
            total += i;
        }

        System.out.println(total);
    }
}
