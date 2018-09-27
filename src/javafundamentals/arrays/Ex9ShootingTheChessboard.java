package javafundamentals.arrays;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Create a chessboard that you can print (You can reuse the one from exercise 5).
 * Ask the user input for a coordinate (for example 'c6') and then substitute the 'c6' text for 'XX'
 * Allow the user to shoot as many times as he wants
 * <p>
 * For example having the board as this:
 * *-----------------------*
 * |a1 b1 c1 d1 e1 f1 g1 h1|
 * |a2 b2 c2 d2 e2 f2 g2 h2|
 * |a3 b3 c3 d3 e3 f3 g3 h3|
 * |a4 b4 c4 d4 e4 f4 g4 h4|
 * |a5 b5 c5 d5 e5 f5 g5 h5|
 * |a6 b6 c6 d6 e6 f6 g6 h6|
 * |a7 b7 c7 d7 e7 f7 g7 h7|
 * |a8 b8 c8 d8 e8 f8 g8 h8|
 * *-----------------------*
 * <p>
 * You ask the user for the input and he says 'c6' then the resulting board should look like this:
 * <p>
 * *-----------------------*
 * |a1 b1 c1 d1 e1 f1 g1 h1|
 * |a2 b2 c2 d2 e2 f2 g2 h2|
 * |a3 b3 c3 d3 e3 f3 g3 h3|
 * |a4 b4 c4 d4 e4 f4 g4 h4|
 * |a5 b5 c5 d5 e5 f5 g5 h5|
 * |a6 b6 XX d6 e6 f6 g6 h6|
 * |a7 b7 c7 d7 e7 f7 g7 h7|
 * |a8 b8 c8 d8 e8 f8 g8 h8|
 * *-----------------------*
 * <p>
 * EXTRA: if the user shoots to an already shoot coordinate then the program should tell the user:
 * "Aim for another, im already done!"
 */

public class Ex9ShootingTheChessboard {
    public static void main(String[] args) {

        gameCycle();
    }

    private static void gameCycle() {
        String[][] boardgame = creation();
        print(boardgame);
        ArrayList<String> positionList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            System.out.println("Type a location on the board:");
            Scanner newscanner = new Scanner(System.in);
            String position = newscanner.next();
            positionList.add(position);
            System.out.println(positionList);
            print(mark(boardgame, positionList));
        }
    }

    private static String[][] creation() {
        String[][] myArray = new String[10][8];
        char letter = 'a' - 1;
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 8; y++) {
                if (x == 0 || x == 9) {
                    myArray[x][y] = "|";

                } else {
                    myArray[x][y] = String.valueOf(letter) + (y + 1);
                }
            }
            letter++;
        }
        return myArray;
    }


    private static String[][] mark(String[][] myArray, ArrayList<String> positionList) {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 8; y++) {
                if (positionList.contains(myArray[x][y])) {
                    myArray[x][y] = "XX";
                }
            }
        }
        return myArray;
    }


    private static void print(String[][] myArray) {
        System.out.println("*-------------------------*");
        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.print(myArray[j][i]);
                System.out.print(" ");
            }
            System.out.println();

        }
        System.out.println("*-------------------------*");
    }

}
