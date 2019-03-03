package streams;

import java.util.Arrays;
import java.util.List;

/**
 * Create an stream of strings with the names of the people in the class
 * Iterate it and print the values.
 */

public class Ex01Stream {

    public static void main(String[] args) {
        List<String> stream = Arrays.asList("Jordan", "Cristian", "Roi", "Alp", "Eileen", "Sabine");
        stream.forEach(System.out::println);
    }
}
