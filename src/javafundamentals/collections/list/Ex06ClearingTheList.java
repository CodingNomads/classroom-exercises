package javafundamentals.collections.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a list with random numbers from 1 to 5
 * If the list contains a 2, delete all the elements in the list resulting into an empty list.
 */

public class Ex06ClearingTheList {
    public static void main(String[] args) {
        List<Integer> randomNoList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            randomNoList.add((int)(Math.random() * 5) +1);
        }
        System.out.println(randomNoList);
        if (randomNoList.contains(2)) {
            randomNoList.clear();
        }
        System.out.println(randomNoList);
    }
}
