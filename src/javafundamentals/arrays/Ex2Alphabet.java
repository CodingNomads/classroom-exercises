package javafundamentals.arrays;

/**
 * Create an array with the Alphabet on it. Put all the letters on the array in uppercase
 * */
public class Ex2Alphabet {
    public static void main(String[] args) {
        char[] alphabetArray = new char[26];

        for (int i = 0; i < alphabetArray.length; i++) {
            alphabetArray[i] = (char)('A' + i);
            System.out.println(alphabetArray[i]);
        }
    }
}
