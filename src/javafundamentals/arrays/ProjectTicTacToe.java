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
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    private static String[][] gameBoard = new String[3][3];


    public static void main(String[] args) {
        String[][] gameBoard = new String[3][3];

        initialiseBoard(gameBoard);

        initialiseBoard();

        printBoard();

        playGame();
    }

    private static void initialiseBoard() {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                gameBoard[i][j] = Character.toString((char) ('a' + (i * gameBoard.length + j)));
            }
        }
    }

    private static void printBoard() {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                if (gameBoard[i][j] == "X") {
                    System.out.print(ANSI_GREEN + gameBoard[i][j] + ANSI_RESET);
                } else if (gameBoard[i][j] == "O") {
                    System.out.print(ANSI_RED + gameBoard[i][j] + ANSI_RESET);
                } else {
                    System.out.print(gameBoard[i][j]);
                }

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

    private static void playGame() {

        System.out.println("Type a letter to place an X");

        userSelection();

        if (checkWin("X")) {
            printBoard();
            System.out.println("Congratulations, you won!!");
        } else if (checkDraw()) {
            printBoard();
            System.out.println("It's a draw!");
        } else {

            aiSelection();

            printBoard();

            if (checkWin("O")) {
                printBoard();
                System.out.println("Sorry, you lost this game...");
            } else {
                playGame();
            }
        }
    }


    private static void userSelection() {
        Scanner scanner = new Scanner(System.in);
        try {
            String spotChosen = scanner.nextLine();
            spotChosen.toLowerCase();
            boolean validSpotChosen = false;

            choiceChecker:
            for (int i = 0; i < gameBoard.length; i++) {
                for (int j = 0; j < gameBoard[i].length; j++) {
                    if (gameBoard[i][j].equals(spotChosen)) {
                        gameBoard[i][j] = ("X");
                        validSpotChosen = true;
                        break choiceChecker;
                    }
                }
            }
            if (!validSpotChosen) {
                System.out.println("This spot cannot be chosen, try again");
                userSelection();
            }

        } catch (Exception e) {
            System.out.println("Invalid input, try again");
            userSelection();
        }
    }

    private static void aiSelection() {
        int randomColumn = (int) (Math.random() * gameBoard.length + 0);
        int randomrow = (int) (Math.random() * gameBoard.length + 0);

        if (!gameBoard[randomColumn][randomrow].equals("X") && !gameBoard[randomColumn][randomrow].equals("O")) {
            gameBoard[randomColumn][randomrow] = "O";
        } else {
            aiSelection();
        }
    }

    private static boolean checkWin(String letter) {
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

    private static boolean checkDraw() {

        boolean isDraw = true;
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                isDraw = isDraw && (gameBoard[i][j].equals("O") || gameBoard[i][j].equals("X"));
            }
        }
        if (isDraw) {
            return true;
        } else {
            return false;
        }
    }

}
