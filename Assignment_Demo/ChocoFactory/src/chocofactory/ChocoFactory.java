package chocofactory;

//imports for JOptionPane, Random, etc.
import javax.swing.JOptionPane;
//import java.util.Random;

/**
 * ChocoTime application for making choco in a dialog Practice: declaring a
 * class with constructor and instance fields and methods declaring and invoking
 * methods with parameters random number generation looping and branching user
 * interaction with JOptionPane
 *
 * @author ypchui CSCI1130 Java Assignment 3 ChocoTime
 *
 * Remark: Name your class, variables, methods, etc. properly. You should write
 * comment for your work and follow good styles.
 */
public class ChocoFactory {

    private static String[] chocoNames;
    private static int[] cocoaPercents;
    private static ChocoMaker chocoMaker;

    /**
     * Show a menu of choices and get user's input, given method
     *
     * @return a String of user input: "1","2","3","4", null means Cancel/Close
     */
    public static String showChocoMenu() {
        /**
         * * student's work to display choco menu items(done) **
         */
        return JOptionPane.showInputDialog("Make Choco: Input your choice\n"
                + "1. 100% Noir\n" + "2. 70% Dark\n"
                + "3. [40%~69%] Candied or Delish\n"
                + "4. Quit");
    }

    public static void sayBye() {
        JOptionPane.showMessageDialog(null, "Bye!");
        System.exit(0);

    }

    /*
   * @param args the command line arguments
   
    chocoMaker = new ChocoMaker();
    for(int i=0; i<3; i++) {
        ChocoRecipe choco = new ChocoRecipe();
        chocoMaker.makeChoco(choco);  
    }
     */
    public static void main(String[] args) {

        chocoMaker = new ChocoMaker();

        while (true) {
            int chocoMenuChoice = ChocoMaker.getChoiceFromChocoMenu();

            // initialize choco names & milk percent
            if (chocoMenuChoice == 1) {
                System.out.println("User picked 1");// optionally printed for debugging
                ChocoRecipe choco = new ChocoRecipe("100% Noir", 100);
                if (chocoMaker.makeChoco(choco) == -1) {
                    sayBye();
                }
                JOptionPane.showMessageDialog(null, "A new 100% Noir is made!");

            } else if (chocoMenuChoice == 2) {
                System.out.println("User picked 2");
                ChocoRecipe choco = new ChocoRecipe("70% Dark", 70);
                if (chocoMaker.makeChoco(choco) == -1) {
                    sayBye();
                }
                JOptionPane.showMessageDialog(null, "A new 70% Dark is made!");

            } else if (chocoMenuChoice == 3) {
                System.out.println("User picked 3");

                //public static int showConfirmDialog
                int Candied = JOptionPane.showConfirmDialog(null, "Candied", "Candied or Delish", JOptionPane.YES_NO_OPTION);
                if (Candied == 0) {
                    ChocoRecipe choco = new ChocoRecipe("Candied");
                    if (chocoMaker.makeChoco(choco) == -1) {
                        sayBye();
                    }
                    JOptionPane.showMessageDialog(null, "A new "
                            + choco.getCocoaPercent() + "% Candied is made!");

                } else if (Candied == 1) {
                    ChocoRecipe choco = new ChocoRecipe("Delish");
                    if (chocoMaker.makeChoco(choco) == -1) {
                        sayBye();
                    }
                    JOptionPane.showMessageDialog(null, "A new "
                            + choco.getCocoaPercent() + "% Delish is made!");

                }

            } else if (chocoMenuChoice == 4) {
                ChocoFactory.sayBye();
            } else {
                JOptionPane.showMessageDialog(null, "Input again");
            }

        }
    }
}
