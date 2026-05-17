
import javax.swing.JOptionPane;

public class Random_Test {

    public static void Random_Test() {
        // The headings
        System.out.println("CUHK Rainfall");
        System.out.println("==================");
        System.out.println("for 2025");

        // Display a bar for each year and then the final axis
        for (int month = 1; month <= 12; month++) {
            bar(month, Math.random() * 40);
        }

        axis();
    }

    public static void bar(int label, double h) {
        // Draws a single histogram bar labelled
        // with the years and consisting of the given
        // number of stars

        System.out.print(label + "\t|");
        int stop = (int) Math.round(h);
        for (int star = 0; star < stop; star++) {
            System.out.print('*');
        }
        System.out.println(" " + stop);
    }

    public static void axis() {
        // Draws a horizontal axis with ticks+1 divisions
        // labelled in steps of 10. Each division is 10
        // characters wide.

        int ticks = 5;

        // Print the line
        System.out.print('\t');
        for (int line = 0; line < ticks * 10; line++) {
            System.out.print("=");
        }
        System.out.println("=");

        //Print the ticks
        System.out.print('\t');
        for (int n = 0; n < ticks; n++) {
            System.out.print("+         ");
        }
        System.out.println('+');
        // Label the ticks, including the last one
        System.out.print('\t');
        for (int n = 0; n <= ticks; n++) {
            System.out.print(n * 10 + "        ");
        }
        System.out.println();

        // Label the whole axis
        System.out.println("\t\t\t\tmm");
    }

    public static void PerformRandomInvestigation() {
        double random1, random2;
        random1 = Math.random();
        random2 = Math.random();
        JOptionPane.showMessageDialog(null, "The numbers are: " + random1 + " and " + random2);
        JOptionPane.showMessageDialog(null, "Max is " + Math.max(random1, random2));
    }

    public static void main(String[] args) {
        Random_Test();
        PerformRandomInvestigation();
    }
}
