public class Q5MatrixOperation {
    //====================D: Transpose and print========================
    private static int[][] transpose(int[][] tarray) {
        int[][] newtarray = new int[tarray[0].length][tarray.length];

        for(int i=0; i<tarray[0].length; i++) {
            for(int j=0; j<tarray.length; j++) 
               newtarray[i][j] = tarray[j][i];
        }
        
        return  newtarray;
    }

    private static void print_array(int[][] newarray) {
        // Write your code here to print array item
        for(int i=0; i< newarray.length; i++) {
            for(int j=0; j<newarray[0].length; j++) 
                System.out.printf("%d ", newarray[i][j]);
            System.out.println();
        }
    }
    
    //====================E: Pair value========================
    static void pairs_value(int inputArray[], int inputNumber) {
        System.out.println("Pairs of elements and their sum:");
        // Write your code here to find the sum value that is equal to inputNumber
        for(int i=0; i< inputArray.length; i++) {
            for(int j=i+1; j< inputArray.length; j++) {
                if (inputArray[i] + inputArray[j] == inputNumber){
                    System.out.println(inputArray[i] + " + " + inputArray[j]+ " = " + inputNumber);
                }
            }  
        }
    }
    
    
    public static void main(String[] args) {
        //===================D: Transpose and Print===============
        int[][] originalArray = { {10, 20, 30}, {40, 50, 60} };
        int[][] transposeArray;

        System.out.println("Original Array:");
        print_array(originalArray);

        System.out.println("Transposed Array:");
        transposeArray = transpose(originalArray);
        print_array(transposeArray);


        //====================E: Pair value========================
        System.out.println("Pair Vale result:");
        pairs_value(new int[] {2, 7, 4, -5, 11, 5, 20}, 15);
        pairs_value(new int[] {14, -15, 9, 16, 25, 45, 12, 8}, 30);       
        
    }
}
