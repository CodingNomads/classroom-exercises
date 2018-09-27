package javafundamentals.arrays;


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
        String[][] myArray = new String[5][5];
        //gameFlow();
        drawFirstBoard(myArray);
    }

    public static void gameFlow(){
        //drawFirstBoard();
    }

    public static void drawFirstBoard(String[][] myArray){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                myArray[i][j]="X";
                System.out.println(myArray[i][j]);
            }
            System.out.println();
        }
    }
}
