
import java.util.Scanner;

class Lab04Ex01 {

    public static void main(String[] args) {
        System.out.println("Please enter the height of the tree:");
        Scanner keyboard = new Scanner(System.in);
        int N = keyboard.nextInt();

        System.out.println("Look!");
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= 2 * N - 1; j++) {
                if (N - i < j && j < N + i) {
                    System.out.printf("^");
                } else if (j < N) {
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
        for (int k = 1; k <= N; k++) {
            if (k == N) {
                System.out.printf("H\n");
            } else {
                System.out.printf(" ");
            }
        }
    }
}
