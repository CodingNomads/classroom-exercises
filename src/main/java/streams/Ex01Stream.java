package streams;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Create an stream of strings with the names of the people in the class
 * Iterate it and print the values.
 */

public class Ex01Stream {



    public static void main(String[] args) {
        Stream<String> classmates = Arrays.asList("Jordan", "Cristian", "Seleni", "Alp", "Eileen").stream();
        classmates.forEach(name -> System.out.println(name));


    }

}
