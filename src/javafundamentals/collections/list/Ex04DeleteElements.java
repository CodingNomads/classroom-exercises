package javafundamentals.collections.list;


import java.util.ArrayList;
import java.util.List;

/**
 * Create an List with numbers from 1 to 10
 * Delete the number 7 and print the list
 */

public class Ex04DeleteElements {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numberList.add(i);
        }

        numberList.remove(numberList.indexOf(7));

        System.out.println(numberList);
    }
}
