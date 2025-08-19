
import java.util.*;

class Lab03Ex02 {

    public static void main(String args[]) {
        //First, you can print each i'th Term to verify your equation is correct.
        System.out.printf("n? ");
        int n, sign;
        Scanner keyboard = new Scanner(System.in);
        n = keyboard.nextInt();
        sign = -1;
        System.out.println("3.000000");
        double T = 3.000000;

        int i;
        for (i = 2; i <= n; i++) {
            sign *= -1;

            T += sign * 4.0 / (2 * i * (2 * i - 1) * (2 * i - 2));
            //we must use * between 2 and i when multiplcation instead of 2i !!!
            //T is a double so we should write 4 as 4.0.

            if (i == 2 || i == n - 1 || i == n)// condition we use ==
            {
                System.out.printf("%.6f\n", T);
            } else if (n >= 5 && i == 3) {
                System.out.println("...");
            }
        }
    }
}
