package javafundamentals.collections.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a List with numbers from 1 to 10.
 * Print the sum of all the values in the list.
 */

public class Ex02Iterate {
    public static void main(String[] args) {
        List<Integer> myNumbers = new ArrayList<>();
        System.out.println(createList(myNumbers));
        System.out.println(addList(myNumbers));

    }

    private static List createList(List<Integer> myList) {
        for (int i = 0; i < 10; i++) {
            myList.add(i + 1);
        }
        return myList;
    }

    private static int addList(List<Integer> myList) {
        int total = 0;
        for (int i : myList) {
            total = total + i;
        }
        return total;
    }
}
