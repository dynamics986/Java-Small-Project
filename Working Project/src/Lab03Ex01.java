
import java.util.*;

class Lab03Ex01 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        long factorial = 1;
        int n, i;
        System.out.println("Input:");
        n = keyboard.nextInt();
        for (i = 1; i < n + 1; i++) {
            factorial *= i;
        }
        System.out.println("The factorial is " + factorial);
    }
}
