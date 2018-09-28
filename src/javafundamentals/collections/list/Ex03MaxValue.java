package javafundamentals.collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Create a List with 20 random numbers.
 * Find the maximum value of the list and print it.
 */

public class Ex03MaxValue {
    public static void main(String[] args) {
        int myLength = 20;
        System.out.println(returnLargest(createList(myLength)));
    }

    private static List<Integer> createList(int length) {
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            myList.add((int) (Math.random() * 100));
        }
        System.out.println(myList);
        return myList;
    }

    private static Integer returnLargest(List<Integer> list) {
        return Collections.max(list);
    }
}
