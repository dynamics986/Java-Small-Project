package chocofactory;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * ChocoFactory application for making choco in a dialog Practice: declaring a
 * class with constructor and instance fields and methods declaring and invoking
 * methods with parameters random number generation looping and branching user
 * interaction with JOptionPane
 *
 * @author ypchui CSCI1130 Java Assignment 3 ChocoFactory
 *
 * Remark: Name your class, variables, methods, etc. properly. You should write
 * comment for your work and follow good styles.
 */

public class ChocoRecipe {

    // Do not MODIFY the two given private fields
    private String name = "";
    private int cocoaPercent;

    // Define more date fields as needed
    ChocoRecipe() {
        this.name = "100% Noir";
        this.cocoaPercent = 100;
    }

    ChocoRecipe(String name, int cocoaPercent) {
        this.name = name;
        this.cocoaPercent = cocoaPercent;
    }

    ChocoRecipe(String name_suffix) {
        //need to modify. why name_suffix
        if (name_suffix.equals("Candied")) {
            this.cocoaPercent = ChocoRecipe.genRandomCocoaPercent(40, 54);
            this.name = cocoaPercent + " Candied";
        }
        if (name_suffix.equals("Delish")) {
            this.cocoaPercent = ChocoRecipe.genRandomCocoaPercent(55, 69);
            this.name = cocoaPercent + " Delish";
        }
    }

    //define genRandomCocoaPercent(int a, int b)
    private static int genRandomCocoaPercent(int a, int b) {
        Random r = new Random();
        return r.nextInt(b - a + 1) + a;
    }

    // Do not MODIFY the method signature which is for CoffeeMaker to call
    public String getName() {
        return name;  // TODO: update the method body as the value returned is Hardcoded now
    }

    // Do not MODIFY the method signature which is for CoffeeMaker to call
    public int getCocoaPercent() {
        return cocoaPercent;  // TODO: update the method body as the value returned is Hardcoded now
    }

    // Do not MODIFY the method signature which is for CoffeeMaker to call
    public void printToConsole() {
        if (cocoaPercent == 100) {
            System.out.println("This classic recipe has 100% cocoa");
        } else if (cocoaPercent == 70) {
            System.out.println("This classic recipe has 70% cocoa");
        } else if (cocoaPercent >= 40 && cocoaPercent <= 54) {
            System.out.println("This candied recipe has " + getCocoaPercent() + "% cocoa");
        } else if (cocoaPercent >= 55 && cocoaPercent <= 69) {
            System.out.println("This delish recipe has " + getCocoaPercent() + "% cocoa");
        }
    }

    public void inputAgain() {
        JOptionPane.showMessageDialog(null, "Input again");
    }

}
