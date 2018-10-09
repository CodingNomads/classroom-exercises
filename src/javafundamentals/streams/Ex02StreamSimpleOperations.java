package javafundamentals.streams;

import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Create an stream of ints with values from 1 to 100
 * (tip: there is a nice method inside IntStream)
 * Print the min, max and count from the stream.
 */

public class Ex02StreamSimpleOperations {
    public static void main(String[] args) {
        //IntStream integerStream = IntStream.rangeClosed(1,100);

        Supplier<IntStream> intStreamSupplier = () -> IntStream.rangeClosed(1,100);

        System.out.println(intStreamSupplier.get().min().getAsInt());
        System.out.println(intStreamSupplier.get().max().getAsInt());
        System.out.println(intStreamSupplier.get().count());
    }
}
