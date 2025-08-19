
import java.util.*;

class Lab09Ex02 {

    public static void main(String[] args) {
        // Write a Java program to create a spiral array of n * n sizes 
        // from a given integer n (n<=10).
        // System.out.println("Input:");
        int dim;
        Scanner s = new Scanner(System.in);
        dim = s.nextInt();

        int[][] array = new int[dim][dim];

        fillSpiral(array, dim);
        printSpiral(array,dim);
    }

    public static void fillSpiral(int[][] array, int n) {
        int value = 1;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                array[top][i] = value++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                array[i][right] = value++;
            }
            right--;
            
            for (int i = right; i >= left; i--) {
                array[bottom][i] = value++;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                array[i][left] = value++;
            }
            left++;
        }
    }

    public static void printSpiral(int[][] array,int dim) {
        //System.out.println("Output:");
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                if (j < dim-1)
                    System.out.printf("%d ", array[i][j]);
                else 
                    System.out.printf("%d", array[i][j]);
            }
            System.out.println();
        }
    }
}
