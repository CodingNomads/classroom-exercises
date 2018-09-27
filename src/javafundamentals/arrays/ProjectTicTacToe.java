package javafundamentals.arrays;


import java.util.Scanner;

/**
 * Fun time! Lets play tic tac toe! You will create your first videogame! Yeah!
 * <p>
 * Create a tic tac toe game (https://www.google.com/search?q=tic+tac+toe).
 * <p>
 * The player will play with 'X' and the IA will play with 'O'
 * The player will start. The game will ask via console where to put the 'X'.
 * After the IA will put in a random slot (not used yet) a 'O'
 * The game will go on until there are no more spots left or one of the players will have 3 in a row
 */

public class ProjectTicTacToe {
    public static void main(String[] args) {
        String[][] gameBoard = new String[3][3];

        initialiseBoard(gameBoard);

        printBoard(gameBoard);

        playGame(gameBoard);
    }

    static void initialiseBoard(String[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                gameBoard[i][j] = Character.toString((char) ('a' + (i * 3 + j)));
            }
        }
    }

    static void printBoard(String[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {

                System.out.print(gameBoard[i][j]);

                if (j != gameBoard[i].length - 1) {
                    System.out.print(" | ");
                }
            }
            if (i != gameBoard.length - 1) {
                System.out.println();
                System.out.println("----------");
            }
        }
        System.out.println();
        System.out.println();
    }

    static void playGame(String[][] gameBoard) {

        System.out.println("Type a letter to place an X");

        userSelection(gameBoard);

        if (checkWin(gameBoard, "X")) {
            printBoard(gameBoard);
            System.out.println("Congratulations, you won!!");
        } else {

            aiSelection(gameBoard);

            printBoard(gameBoard);

            if (checkWin(gameBoard,"O")) {
                printBoard(gameBoard);
                System.out.println("Sorry, you lost this game...");
            } else { playGame(gameBoard);

            }
        }
    }

    static void userSelection(String[][] gameBoard) {
        Scanner scanner = new Scanner(System.in);
        try {
            String spotChosen = scanner.nextLine();
            spotChosen.toLowerCase();
            boolean validSpotChosen = false;

            choiceChecker:
            for (int i = 0; i < gameBoard.length; i++) {
                for (int j = 0; j < gameBoard[i].length; j++) {
                    if (gameBoard[i][j].equals(spotChosen)) {
                        gameBoard[i][j] = "X";
                        validSpotChosen = true;
                        break choiceChecker;
                    }
                }
            }
            if (!validSpotChosen) {
                System.out.println("This spot cannot be chosen, try again");
                userSelection(gameBoard);
            }

        } catch (Exception e) {
            System.out.println("Invalid input, try again");
            userSelection(gameBoard);
        }
    }

    static void aiSelection(String[][] gameBoard) {
        int randomColumn = (int) (Math.random() * 3 + 0);
        int randomrow = (int) (Math.random() * 3 + 0);

        if (!gameBoard[randomColumn][randomrow].equals("X") && !gameBoard[randomColumn][randomrow].equals("O")) {
            gameBoard[randomColumn][randomrow] = "O";
        } else {
            aiSelection(gameBoard);
        }
    }

    static boolean checkWin (String[][] gameBoard,String letter) {
        boolean winsHorizontally = false;

        //Check horizontal wins
        for (int i = 0; i < gameBoard.length; i++) {
            winsHorizontally = true;
            for (int j = 0; j < gameBoard[i].length; j++) {
                winsHorizontally = winsHorizontally && gameBoard[i][j].equals(letter);
            }
            if (winsHorizontally) {
                return true;
            }
        }

        boolean winsVertically = false;

        for (int i = 0; i < gameBoard.length; i++) {
            winsVertically = true;
            for (int j = 0; j < gameBoard[i].length; j++) {
                winsVertically = winsVertically && gameBoard[j][i].equals(letter);
            }
            if (winsVertically) {
                return true;
            }
        }

        boolean winsDiagonallyRight = true;

        for (int i = 0; i < gameBoard.length; i++) {
            winsDiagonallyRight = winsDiagonallyRight && gameBoard[i][i].equals(letter);
        }
        if (winsDiagonallyRight) {
            return true;
        }

        boolean winsDiagonallyLeft = true;

        int indexColumn = gameBoard.length - 1;
        int indexRow = 0;

        while (indexColumn >= 0) {
            winsDiagonallyLeft = winsDiagonallyLeft && gameBoard[indexRow][indexColumn].equals(letter);
            indexColumn--;
            indexRow++;
        }
        if (winsDiagonallyLeft) {
            return true;
        }
        return false;
    }
}
