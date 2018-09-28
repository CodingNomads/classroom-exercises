package javafundamentals.arrays;

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
        String[][] chessPositions = new String[8][8];
        String chosenPositions = "";

        for (int i = 0; i < chessPositions.length; i++) {
            for (int j = 0; j < chessPositions[i].length; j++) {
                char column = (char) ('a' + j);
                chessPositions[i][j] = Character.toString(column) + (i + 1);
            }
        }

        startChessGame(chessPositions,chosenPositions);

    }

    static void startChessGame (String[][] chessPositions, String chosenPositions) {
        Scanner scanner = new Scanner(System.in);

        printChessboard(chessPositions);
        System.out.println("Pick a spot to shoot on the chessboard");

        String chosenSpot = scanner.nextLine();

        boolean spotAlreadychosen = false;

        boardChecker:
        for (int i = 0; i < chessPositions.length; i++) {
            for (int j = 0; j < chessPositions[i].length; j++) {
                if (chessPositions[i][j].equals(chosenSpot)) {
                    chosenPositions += chessPositions[i][j] + " ";
                    chessPositions[i][j] = "XX";
                    break boardChecker;
                } else if (chosenPositions.contains(chosenSpot) && !chosenSpot.contains(" ")) {
                    spotAlreadychosen = true;
                    break boardChecker;
                }
            }
        }

        if (spotAlreadychosen) {
            System.out.println("Aim for another, I'm already done!");
        }

        startChessGame(chessPositions, chosenPositions);
    }

    static void printChessboard (String[][] chessboardArray) {
        System.out.println("*-----------------------*");
        for (int i = 0; i < chessboardArray.length; i++) {
            System.out.print("|");
            for (int j = 0; j < chessboardArray.length; j++) {
                if (j != chessboardArray.length - 1) {
                    System.out.print(chessboardArray[i][j] + " ");
                } else {
                    System.out.print(chessboardArray[i][j] + "|");
                }
            }
            System.out.println();
        }
        System.out.println("*-----------------------*");
    }

}
