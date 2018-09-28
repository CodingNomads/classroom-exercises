package javafundamentals.collections.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a list with random numbers from 1 to 5
 * If the list contains a 2, delete all the elements in the list resulting into an empty list.
 */

public class Ex06ClearingTheList {
    public static void main(String[] args) {
        listDeletion(listCreation(10));
    }

    private static List<Integer> listCreation(int length) {
        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            randomList.add((int) (Math.random() * 5));
        }
        System.out.println(randomList);
        return randomList;
    }

    private static List<Integer> listDeletion(List<Integer> theList) {
        if (theList.contains(2)) {
            theList.clear();
            System.out.println(theList);
        } else {
            System.out.println("There were no 2s in the list!");
        }

        return theList;

    }
}
