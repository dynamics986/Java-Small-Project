import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

// let's complete the class SquareMatrix here
class SquareMatrix extends Matrix {
    // define your fields, constructor and more instance methods here
    // YOUR CODE HERE

    public SquareMatrix(int dim, String file) {
        super(dim, dim);
        try (Scanner s = new Scanner(new File(file))) {
            for (int i = 0; i < this.rowM ; i++) {
                for (int j = 0; j < this.colN ; j++) {
                    if (s.hasNextDouble()) {
                        data[i][j] = s.nextDouble();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
    
            
    protected boolean isDiagonal() {
        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getRow(); j++) {
                if (i != j && getData()[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }

}

// Given the class Matrix here
class Matrix {

    // fields, constructor and more instance methods
    protected int rowM, colN;
    protected double[][] data;

    public Matrix(int m, int n) {
        this.rowM = m;
        this.colN = n;
        this.data = new double[m][n];
    }

    // instance method toString() 
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < rowM; i++) {
            for (int j = 0; j < colN; j++) {
                str.append(String.format("%10.2f ", data[i][j]));
            }
            str.append("\n");
        }
        return str.toString();
    }

    protected int getRow() {
        return this.rowM;
    }

    protected int getCol() {
        return this.colN;
    }

    protected double[][] getData() {
        return this.data;
    }
}

class Lab09Ex01 {

    public static void main(String[] args) {

        // Do not touch the following lines
        Scanner keyin = new Scanner(System.in);
        int m;

        System.out.println("m?");
        m = keyin.nextInt();

        SquareMatrix mat;
        mat = new SquareMatrix(m, "matrix" + m + ".txt");
        System.out.print(mat);
        System.out.println(mat.isDiagonal());

        // The End 
    }
}
