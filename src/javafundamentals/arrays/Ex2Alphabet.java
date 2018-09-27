package javafundamentals.arrays;

/**
 * Create an array with the Alphabet on it. Put all the letters on the array in uppercase
 */

public class Ex2Alphabet {
    public static void main(String[] args) {


        char[] alphabet = new char[26];
        char letter = 'A';
        for (int x = 0; x <= 25; x++) {
            alphabet[x] = letter;
            System.out.println(alphabet[x]);
            letter++;
        }
    }
}
