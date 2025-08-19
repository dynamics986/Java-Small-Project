import java.util.Scanner;
// let's complete the class Matrix here

class Matrix {
    // define your fields, constructor and more instance methods here
    private final int rowM;
    private final int colM;
    private final double[][] array; 
    // YOUR CODE HERE

    Matrix (int row, int col) {
        rowM = row;
        colM = col;
        array = new double[rowM][colM];
    }

    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i< rowM; i++){
            for (int j=0;j<colM; j++){
                sb.append(String.format("%10.2f", array[i][j]));
                if (j!=colM) 
                    sb.append(" ");
            }
        sb.append('\n');
        }
        return sb.toString();
    }
    // method toString() shall return a String representation of the Matrix
    //   but the method itself prints nothing.
    //   Use format specifier "%10.2f" for each element without extra space.
    
    public void add(double addin){
        for (int i=0; i< rowM; i++){
            for (int j=0; j<colM; j++){
                array[i][j] += addin;
            }
        }
    }
   
}

class Lab08Ex02 {
    
    public static void main(String[] args) {
        
        // Do not touch the following lines
        // 
        Scanner keyin = new Scanner(System.in);
        int m, n;
        double a;

        System.out.println("m? n? a?");
        m = keyin.nextInt();
        n = keyin.nextInt();
        a = keyin.nextDouble();

        Matrix mat1;
        mat1 = new Matrix(m, n);
        mat1.add(a);
        System.out.println(mat1.toString());

    }
}
