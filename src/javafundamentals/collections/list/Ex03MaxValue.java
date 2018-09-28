package javafundamentals.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Create a List with 20 random numbers.
 * Find the maximum value of the list and print it.
 */

public class Ex03MaxValue {
    public static void main(String[] args) {
        List<Integer> randomNoList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            randomNoList.add((int)(Math.random() * 100 -1) +1);
        }

        System.out.println(randomNoList);
        System.out.println(Collections.max(randomNoList) + " is the biggest");

    }
}
