package javafundamentals.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Create an ArrayList of String type that will contain some color names
 * Print the array list in console.
 * <p>
 * Create a LinkedList containing some other color names.
 *
 * Play a bit with both to see what methods has each one and its differences
 */

public class Ex01Creation {

    public static void main(String[] args) {

        List<String>colorList = new ArrayList<>();
        colorList.add("green");
        colorList.add("blue");
        colorList.add("red");

        System.out.println(colorList);

        List<String>moreColorsList = new LinkedList<>();
        moreColorsList.add("purple");
        moreColorsList.add("orange");
        moreColorsList.add("yellow");

        System.out.println(moreColorsList);
    }
}
