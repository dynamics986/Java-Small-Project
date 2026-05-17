package Francis_Project;

import java.util.*;
import javax.swing.JOptionPane;

public class Practice3 {

    public static void main(String[] args) {

        getTime.Execute();
        Panel.Execute();
        JOptionPane.showMessageDialog(null, "Justin will get master list in 2025.");
        JOptionPane.showMessageDialog(null, "Francis will have his beloved in 2025.");
        JOptionPane.showMessageDialog(null, "We all have bright future.");

    }
}

class Panel {

    public static void Execute() {
        int result = JOptionPane.showConfirmDialog(
                null, // Parent component (null for center screen)
                "Do you want to proceed?", // Message
                "Confirmation", // Title
                JOptionPane.YES_NO_CANCEL_OPTION // Option type
        );

        // Handle the user's choice
        switch (result) {
            case JOptionPane.YES_OPTION ->
                System.out.println("User chose Yes.");
            case JOptionPane.NO_OPTION ->
                System.out.println("User chose No.");
            case JOptionPane.CANCEL_OPTION ->
                System.out.println("User chose Cancel.");
            default ->
                System.out.println("Dialog closed without selection.");
        }
    }
}

class getTime {

    public static void Execute() {
        Calendar cal = Calendar.getInstance();
        Date date = new Date();
        cal.setTime(date);

        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(cal.getTime());
    }

}
