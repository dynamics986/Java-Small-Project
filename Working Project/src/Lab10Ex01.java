import java.util.Scanner;

// let's extend the class Matrix here 

// Given the partially completed class Matrix here
class Matrix {
    // fields, constructor and more instance methods
    private final int rowM;
    private final int colN;
    private final double[][] data;

    public Matrix(int m, int n) {
        this.rowM = m;
        this.colN = n;
        this.data = new double[m][n];
    }

    // instance method toString() 
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for(int i=0; i<rowM; i++) {
            for(int j=0; j<colN; j++) 
                str.append(String.format("%10.2f ", data[i][j]));
            str.append("\n");
        }
        return str.toString();
    }

    public void setData(double[][] data) {
        for(int i=0; i<rowM; i++) 
            for(int j=0; j<colN; j++) 
	        this.data[i][j] = data[i][j];
    }

    // define more instance methods here
    // YOUR CODE HERE
    
    public double subMatrixSum (int rowS, int colS, int nRow, int nCol){
        double result = 0;
        for(int i=rowS; i <= nRow+rowS; i++) 
            for(int j=colS; j<= nCol+colS; j++) 
	        result += data[i][j];
        return result;
    }
    
    public void printTranspose(){
        for(int i=0; i<colN; i++) {
            for(int j=0; j<rowM; j++) 
                System.out.printf("%10.2f ", data[j][i]);
            System.out.println();
        }
    }


}

class Lab10Ex01 {
  public static void main(String[] args) {
      
    // Do not touch the following lines
    // 
    Scanner keyin = new Scanner(System.in);
    int m, n;
    
    System.out.println("m? n?");
    m = keyin.nextInt();
    n = keyin.nextInt();
    double[][] data = new double[m][n];
    
    System.out.println("Enter "+ m*n +" elements");
    
    for(int i=0; i<m; i++) 
        for(int j=0; j<n; j++) 
	    data[i][j] = keyin.nextDouble();

    Matrix mat;
    mat = new Matrix(m, n);
    mat.setData(data);
    System.out.println(mat.subMatrixSum(0,0,m-2,n-2));
    mat.printTranspose();

  }
}
