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
        List<String> colorList = new ArrayList<>();

        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("Yellow");

        System.out.println(colorList);

        LinkedList<String> colorList2 = new LinkedList<String>();

        colorList2.add("Brown");
        colorList2.add("White");
        colorList2.add("Lilac");
        colorList2.add("Turquoise");


    }

}
