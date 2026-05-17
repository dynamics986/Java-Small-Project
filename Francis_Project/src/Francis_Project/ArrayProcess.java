package Francis_Project;

import java.io.PrintStream;

class ArrayProcess {
    
    void print (char[][] arr){
        PrintStream s = System.out;
        if (arr == null)
            s.print("null");
        else {
            s.print("[");
            for(int i=0; i<arr.length; i++) {
                s.print(i);
                if (arr[i] == null)
                    s.print("null");
                else {
                    s.print("[");
                    for(int j=0; j<arr[i].length; j++) {
                        s.printf("%d<%c>",j,arr[i][j]);
                    }
                    s.print("]");
                } 
            }
            s.print("]");
        }
        
    } 

    public static void main(String[] args) {
        ArrayProcess a = new ArrayProcess();
        char[][] test = null;
        a.print(test);
        System.out.println();
        
        a.print(new char[0][]);
        System.out.println();
        
        char[][] test2 = {{'A','B','C'},null,{},{'S','O','\\'} };
        a.print(test2);
        System.out.println();
    }

}
