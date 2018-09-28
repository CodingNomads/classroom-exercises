package javafundamentals.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Create an ArrayList of String type that will contain some color names
 * Print the array list in console.
 * <p>
 * Create a LinkedList containing some other color names.
 * <p>
 * Play a bit with both to see what methods has each one and its differences
 */

public class Ex01Creation {
    public static void main(String[] args) {
        List<String> someColors = new ArrayList<>();
        someColors.add("blue");
        someColors.add("red");
        someColors.add("yellow");
        someColors.add("purple");
        System.out.println(someColors);

        List<String> positions = new LinkedList<>();
        positions.add("First");
        ((LinkedList<String>) positions).addFirst("Second");
        System.out.println(positions);
        ((LinkedList<String>) positions).addLast("Third");
        ((LinkedList<String>) positions).addFirst("First");
        ((LinkedList<String>) positions).removeLastOccurrence("First");
        System.out.println(positions);
    }
}
