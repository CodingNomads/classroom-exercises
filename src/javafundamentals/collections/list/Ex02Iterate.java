package javafundamentals.collections.list;

import java.util.List;
import java.util.ArrayList;

/**
 * Create a List with numbers from 1 to 10.
 * Print the sum of all the values in the list.
 */

public class Ex02Iterate {

    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();
        for(int i = 1; i < 11; i++) {
            numberList.add(i);
        }

        int sum = 0;

        for(int i = 0; i < 10; i++) {
             sum += numberList.get(i);
        }
        System.out.println(sum);
    }
}
