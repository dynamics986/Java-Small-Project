
import java.util.Scanner;

class Lab07Ex01 {

    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);
        String str = r.nextLine();
        
        boolean isP = true;
        int N = str.length();

        // check if pair of i vs ?, not same
        // isP = false;
        for (int i = 0; i<= N/2; i++){
            if (str.charAt(i) != str.charAt(N-i-1)){
                isP = false;
                break;
            }
                
        }
        /* 
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(4)); 
        */

        if (isP)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
