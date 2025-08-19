
import java.util.*;

class Lab02Ex02 {

    public static void main(String[] args) {
        System.out.println("Input Monthly Salary:");
        int a;
        Scanner keyboard = new Scanner(System.in);
        a = keyboard.nextInt();
        // Your code here
        int MPF;
        if (a < 7100) {
            MPF = 0;
        } else if (7100 <= a && a <= 30000) {
            MPF = (int) Math.round(a * 0.05);
        } else {
            MPF = 1500;
        }
        System.out.println("Monthly Mandatory Contribution:");
        System.out.println(MPF);
        // End    
    }
}
