package javafundamentals.arrays;

/**
 * Create an array with the Alphabet on it. Put all the letters on the array in uppercase
 */

public class Ex2Alphabet {
    public static void main(String[] args) {

//        char[] alphabet = new char[26];
//        char letter;
//        int number;
//
//        for (number = 65; number < 91; number++) {
//
//            alphabet[number-65] = (char)number;
//
//        }
//        System.out.println(alphabet);


        char[] alphabet = new char[26];

        for (int number = 65; number < 91; number++) {

            alphabet[number - 65] = (char) number;

        }
        System.out.println(alphabet);
    }
}
