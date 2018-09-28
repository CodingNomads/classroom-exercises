package javafundamentals.collections.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Create a list containing 3 european city names.
 * Create another list containing 3 american city names.
 * Combine them both into one list.
 */

public class Ex05CombineTwoLists {
    public static void main(String[] args) {
        List<String> europeanCities = new ArrayList<>();
        europeanCities.add("London");
        europeanCities.add("Paris");
        europeanCities.add("Rome");

        List<String> americanCities = new ArrayList<>();
        americanCities.add("New York");
        americanCities.add("Louisville");
        americanCities.add("Las Vegas");

        System.out.println(addCities(europeanCities, americanCities));
    }

    private static List<String> addCities(List<String> firstList, List<String> secondList) {
        List<String> allCities = new ArrayList<>();
        for (String i : firstList) {
            allCities.add(i);
        }
        for (String i : secondList) {
            allCities.add(i);
        }
        return allCities;
    }
}
