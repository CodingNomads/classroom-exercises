package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;


/**
 * Create an stream of strings with the names of the people in the class
 * Iterate it and print the values.
 */

public class Ex01Stream {
    public static void main(String[] args) {

       List<String> names = Arrays.asList("Roi, Jordan", "Cristian", "Sabine", "Alp", "Eileen");

       names.stream().forEach(string-> System.out.print(string + " "));
    }
}