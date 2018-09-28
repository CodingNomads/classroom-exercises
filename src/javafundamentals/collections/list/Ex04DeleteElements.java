package javafundamentals.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Create an List with numbers from 1 to 10
 * Delete the number 7 and print the list
 */

public class Ex04DeleteElements {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        createList(myList);
        myList.removeAll(Collections.singleton(7));
        System.out.println(myList);

    }

    private static List<Integer> createList(List<Integer> myList) {
        for (int i = 0; i < 10; i++) {
            myList.add(i + 1);
        }
        System.out.println(myList);
        return myList;
    }
}
