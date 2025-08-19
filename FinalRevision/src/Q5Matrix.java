/*
 * Understanding array and reference
 */
public class Q5Matrix {
    protected int m, n;
    protected double[][] cell;

    public Q5Matrix(int row, int col) {
        m = row;
        n = col;
        cell = new double[m][n];
    }
    
    // A: subMatrixSum operation
    public double subMatrixSum(int rowS, int colS, int nRow, int nCol) {
        // Hit: Boundary Checks
        if (rowS < 0 || colS < 0 || rowS + nRow > m || colS + nCol > n) {
            throw new IllegalArgumentException("Submatrix dimensions are out of bounds");
        }
        double sum = 0;
        for(int i=rowS; i <= nRow+rowS; i++) 
            for(int j=colS; j<= nCol+colS; j++) 
	        sum += cell[i][j];
        return sum;
    }
    
    
    public static void main(String[] args) {
        //====================B: Failed Version===========================
        System.out.println("Failed Version");
        int [][] matrix = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int [][] temp = matrix;
        // Rotated 90 clockwise
        for(int r = 0; r < 4; r++) {
            for(int c = 0; c < 4; c++) {
                matrix[c][4-1-r] = temp[r][c];
            }
        } 
        // Display rotated matrix
        for(int r = 0; r < 4; r++) {
            for(int c = 0; c < 4; c++) {
                System.out.printf("%d ", matrix[r][c]);
            }
            System.out.println();
        } 
        
        
        // ====================C: Correction Version======================
        System.out.println("Correct Version");
        // Correct he failed code above
        // Rotated 90 clockwise
        
        int [][] temp1 = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        for(int r = 0; r < 4; r++) {
            for(int c = 0; c < 4; c++) {
                matrix[c][4-1-r] = temp1[r][c];
            }
        } 
        // Display rotated matrix
        for(int r = 0; r < 4; r++) {
            for(int c = 0; c < 4; c++) {
                System.out.printf("%d ", matrix[r][c]);
            }
            System.out.println();
        } 
    }
}