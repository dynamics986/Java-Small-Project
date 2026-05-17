package boardgame;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * CSCI1130 Java Assignment 6 NQueen BoardGame Aim: Practise subclassing, method
 * overriding, game logic.
 *
 * Note: Windows/Mac/Linux may show different look-and-feel.
 *
 * I declare that the assignment here submitted is original except for source
 * material explicitly acknowledged, and that the same or closely related
 * material has not been previously submitted for another course. I also
 * acknowledge that I am aware of University policy and regulations on honesty
 * in academic work, and of the disciplinary guidelines and procedures
 * applicable to breaches of such policy and regulations, as contained in the
 * website.
 *
 * University Guideline on Academic Honesty:
 * https://www.cuhk.edu.hk/policy/academichonesty Faculty of Engineering
 * Guidelines to Academic Honesty:
 * https://www.erg.cuhk.edu.hk/erg/AcademicHonesty
 *
 * Course Code  : CSCI1130A 
 * Student Name : FAN Sixing 
 * Student ID   : 1155211001 
 * Date         : 26/11/2024
 *
 * NQueen is a SinglePlayerGame, that is a BoardGame.
 *
 * @author Michael FUNG
 * @since Nov 2024
 */
public class NQueen extends SinglePlayerGame {

    /**
     * * STUDENTS' FIELDS HERE **
     */
    // E.g., some variables and arrays for keeping game state
    protected int[][] place;
    protected int numQueens;

    /**
     * NQueen default constructor of a trivial game.
     */
    public NQueen() {
        this(1);
    }

    /**
     * NQueen constructor.
     *
     * @param n is game side length (width = height = n)
     */
    public NQueen(int n) {
        // super class constructor will call initGame()
        super(n, n);
        
        
        /**
         * * STUDENTS' WORK HERE **
         */
        place = new int[n][n];
        numQueens = 0;
        String title = "NQueen " + n + "x" + n + ": place " + n + " queens peacefully";
        this.setTitle(title);
        addLineToOutput(title);
        addLineToOutput("Toggle the buttons to place/remove one queen at each step");
        addLineToOutput("One queen is allowed on each row, col and diagonal");
    }

    /**
     * * STUDENTS' WORK HERE **
     */
    // E.g., define some methods, override some methods, etc.
    // See given completed class MagicSquare to get ideas.
    // initGame(): setup a new game
    @Override
    protected void initGame() {
        super.initGame();
        // all entries of place will be set to 0 by default;
        for (int y = 0; y < yCount; y++) {
            for (int x = 0; x < xCount; x++) {
                pieces[x][y].setText("*");
                // set opacity to reveal color background
                pieces[x][y].setOpaque(true);
            }
        }
        score = 0;
        step = 0;
    }

    // gameAction(): do something when a player makes a new move
    @Override
    protected void gameAction(JButton triggeredButton, int x, int y) {
        
        // If the player tries to place n+1 Queens, show advice and do not advance step count;
        
        numQueens = 0; // pay attention, initialize it to zero
        for (int j = 0; j < yCount; j++) {
            for (int i = 0; i < xCount; i++) {
                numQueens += place[i][j];
            }
        }
        
        if (numQueens == xCount && place[x][y] == 0) {
            addLineToOutput("All queens on board, remove some!");
        } 
        else {
            // modify the current status
            if (place[x][y] == 1){
                place[x][y] = 0;
                triggeredButton.setText("*");
                triggeredButton.setBackground(null);
                numQueens--;
            }
            else {
                place[x][y] = 1;
                triggeredButton.setText("Q");
                triggeredButton.setBackground(Color.YELLOW);
                numQueens++;
            }

             // show toggle location
            addLineToOutput("Toggle at (" + x + ", " + y + ")");

            if (numQueens<4){
                addLineToOutput("Queen count "+ numQueens + " / " + xCount);
            }
            else 
                addLineToOutput("Queen count "+ xCount + " / " + xCount);
           
            // after placing a new piece, check end game
            checkEndGame(x, y);
            
            if (numQueens >= xCount)
                addLineToOutput("All pieces filled!");

            // method checkEndGame sets the field gameEnded, proceed accordingly
            if (gameEnded) {
                addLineToOutput("Finished in "+ step + " steps!");
                addLineToOutput("Game ended!");
                JOptionPane.showMessageDialog(null, "Game ended!");
            } 
            else {
                nextStep();
            }
        }    
        // by default, the triggered button is disabled
        // triggeredButton.setEnabled(true);
    }

    @Override
    protected boolean checkEndGame(int moveX, int moveY) {
        score = 0;

        int sum;

        // check col conflicts
        for (int y = 0; y < yCount; y++) {
            sum = 0;
            for (int x = 0; x < xCount; x++) {
                sum += place[x][y];
            }
            if (sum > 1) {
                score--;
            }
        }

        // check row conflicts
        for (int x = 0; x < xCount; x++) {
            sum = 0;
            for (int y = 0; y < yCount; y++) {
                sum += place[x][y];
            }
            if (sum > 1) {
                score--;
            }
        }

        // check \ conflicts
        for (int dif = 2 - xCount; dif <= xCount - 2; dif++) {
            sum = 0;
            int initial, x;
            if (dif < 0) {
                initial = 0;
            } else {
                initial = dif;
            }
            
            for (x = initial; x - dif < yCount && x < xCount; x++) {
                sum += place[x][x - dif];
            }
            if (sum > 1) {
                score--;
            }
        }

        // check / conflicts
        for (int add = 1; add <= 2 * xCount - 3; add++) {
            sum = 0;
            int initial, x;
            if (add < yCount) {
                initial = 0;
            } else {
                initial = add - yCount + 1;
            }
            for (x = initial; x < xCount && add - x >= 0; x++) {
                sum += place[x][add - x];
            }
            if (sum > 1) {
                score--;
            }
        }

        addLineToOutput("Score: " + score);
        
        if (score == 0 && numQueens == xCount) {
            gameEnded = true;
        } // gameEnded is set to be fault by default

        return gameEnded;
    }

    /**
     * NQueen main() GIVEN
     *
     * @param args is an array of String command line arguments.
     */
    public static void main(String[] args) {
        // create a default size game
        NQueen nqg;
        nqg = new NQueen();
        nqg.setSize(400, 550);
        nqg.verbose = false;

        // create a 4x4 game
        nqg = new NQueen(4);
        nqg.setSize(400, 550);
        nqg.setLocation(500, 50);
        nqg.verbose = true;
        // the game has started and GUI thread will take over here
    }
}
