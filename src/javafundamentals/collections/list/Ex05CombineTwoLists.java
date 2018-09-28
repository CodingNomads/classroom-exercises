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

        europeanCities.add("Portsmouth");
        europeanCities.add("Vigo");
        europeanCities.add("Krakow");

        List<String> usCities = new ArrayList<>();
        usCities.add("New York City");
        usCities.add("Dallas");
        usCities.add("Denver");

        List<String> globalCities = new ArrayList<>();

        globalCities.addAll(europeanCities);
        globalCities.addAll(usCities);

        System.out.println(globalCities);
    }
}
