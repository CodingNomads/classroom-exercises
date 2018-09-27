package javafundamentals.arrays;

/**
 * Create a bidimensional array containing the values of the chess table and print it
 * ---a  b  c  d  e  f  g  h
 * --*-----------------------*
 * 1 |a1 b1 c1 d1 e1 f1 g1 h1|
 * 2 |a2 b2 c2 d2 e2 f2 g2 h2|
 * 3 |a3 b3 c3 d3 e3 f3 g3 h3|
 * 4 |a4 b4 c4 d4 e4 f4 g4 h4|
 * 5 |a5 b5 c5 d5 e5 f5 g5 h5|
 * 6 |a6 b6 c6 d6 e6 f6 g6 h6|
 * 7 |a7 b7 c7 d7 e7 f7 g7 h7|
 * 8 |a8 b8 c8 d8 e8 f8 g8 h8|
 * --*-----------------------*
 */

public class Ex5BidimensionalArray {

    public static void main(String[] args) {
        String[][] myArray = new String[8][8];
        print(creation(myArray));
    }

    public static String[][] creation(String[][] myArray) {
        char letter = 'a';
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                myArray[x][y] = String.valueOf(letter) + (y + 1);
            }
            letter++;
        }
        return myArray;
    }

    public static void print(String[][] myArray) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(myArray[j][i]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    //System.out.println(myArray);
}

