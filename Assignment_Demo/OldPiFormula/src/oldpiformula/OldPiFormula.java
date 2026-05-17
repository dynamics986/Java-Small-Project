
package oldpiformula;

/**
 * CSCI1130 Java Assignment 2 OldPiFormula
 *
 * Remark: Name your class, variables, methods, etc. properly.
 * You should write comment for your work and follow good styles.
 */
import java.util.Scanner;

public class OldPiFormula {

    /**
     * Compute arctangent based on Taylor series expansion and print steps
     *
     * @param z the input arguments in double
     * @param m the number of terms to be summed in int
     * @return result of arctan(z) in double we create an arctan method
     */
    public static double arctan(double z, int m) {
        double result = 0;
        int sign = -1;
        double t = z;
        System.out.printf("arctan(1/%d):\n", (int) (1.0 / z));
        for (int i = 1; i <= m; i++) {
            sign *= -1;
            if (i > 1) {
                t *= z * z;
            }

            result += sign * t / (2 * i - 1);
            if (i == 1 || i == 2 || i == m - 1 || i == m)// condition we use ==
            {
                System.out.printf("%.13f\n", result);
            } else if (m > 4 && i == 3) {
                System.out.println("...");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // create a new Scanner object, named keyboard
        Scanner keyboard = new Scanner(System.in);
        System.out.print("a? ");
        int a = keyboard.nextInt();
        System.out.print("b? ");
        int b = keyboard.nextInt();
        System.out.print("c? ");
        int c = keyboard.nextInt();
        System.out.print("m? ");
        int m = keyboard.nextInt();
        //validation
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Invalid input!");
            System.exit(1);
        }

        if (m < 1 && m > 20) {
            System.out.println("Invalid input!");
            System.exit(1);
        }

        // ... get inputs, call arctan() and find out pi ...
        double answer = 4 * a * arctan(1.0 / b, m) - 4 * arctan(1.0 / c, m);

        System.out.printf("pi: %.13f\n", answer); // send printf() message
    }
}
