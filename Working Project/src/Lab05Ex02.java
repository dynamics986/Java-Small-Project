
import java.util.Scanner;

class Lab05Ex02 {
  public static void main(String[] args) {

    int guess = 0;
    while (guess != 7){
        System.out.printf("Guess my age? ");
        Scanner s = new Scanner(System.in);
        guess = s.nextInt();  
    }
        System.out.printf("You got it!");
  }
}