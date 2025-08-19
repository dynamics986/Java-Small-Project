
import java.util.Scanner;

class Lab07Ex02 {
    
    public static void main(String[] args){
        
        Scanner r = new Scanner(System.in);
        String Message = r.nextLine();
        StringBuilder sb = new StringBuilder(Message);
        sb.reverse();// Reverse the string
        System.out.println(sb.toString()); 
        
        for (int i = 0; i < sb.length(); i++){
            if ( 'a'<= sb.charAt(i) && sb.charAt(i)<= 'z' )
                System.out.printf("%c",sb.charAt(i));
            if ( 'A'<= sb.charAt(i) && sb.charAt(i)<= 'Z' )
                System.out.printf("%c",sb.charAt(i));
        }
        //System.out.println();
    }
}