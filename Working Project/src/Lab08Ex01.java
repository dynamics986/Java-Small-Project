import java.util.Scanner;

class Lab08Ex01 {

    public static void main(String[] args) {
        int n;
        Scanner r = new Scanner(System.in);
        System.out.println("Input n:");
        n = r.nextInt();
        System.out.println("Input " + n + " integers:");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = r.nextInt();
            System.out.print(array[i]);
            if (i < n)
                System.out.print(" ");
        }
        System.out.println();
        
        boolean Delete[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            Delete[i] = false;
        }
       
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array [j])
                    Delete[j] = true;
            }
        }
        
        for (int i = 0; i < n; i++){
            if (Delete[i] == false){
                System.out.print(array[i]);
            if (i < n-1)
                System.out.print(" ");
            }
        }
        System.out.println();
        
    }
}
