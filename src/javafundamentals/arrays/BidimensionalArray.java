package javafundamentals.arrays;

/**
 * Create a bidimensional array containing the values of the chess table and print it
 *   a  b  c  d  e  f  g  h
 * 1 a1 b1 c1
 * 2 a2 b2
 * 3 a3 b3
 * 4
 * 5
 * 6
 * 7
 * 8
 * */
public class BidimensionalArray {
    public static void main(String[] args) {
        String[][] chessPositions = new String[8][8];

        for (int i = 0; i < chessPositions.length; i++) {
            for (int j = 0; j < chessPositions[i].length; j++) {
                char column = (char)('a' + j);
                chessPositions[i][j] = Character.toString(column) + (i+1);
            }
        }

        for (int i = 0; i < chessPositions.length;i++) {
            for (int j = 0; j < chessPositions.length;j++) {
                System.out.print(chessPositions[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
