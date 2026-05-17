import java.io.*;
import java.io.PrintStream;
/**
 *
 * @author Francis
 */
public class Pattern {
    
    public static void printPattern(String filename, int N){
        if ( !(N<1 || N%2 != 1) ){
            int i , j;
            try{
                File f = new File (filename);
                PrintStream ps = new PrintStream(f);
               
                for (i=0;i<N+2;i++){
                    
                    if (i==0){
                        for (j=0;j<N+2;j++)
                            ps.printf("X");
                    }
                    
                    if (i==N+1){
                        for (j=0;j<N+2;j++)
                            ps.printf("X");
                    }
                    
                    if (i==(N+1)/2){
                        ps.printf("X");
                        for (j=0;j<N;j++)
                            ps.printf("#");
                        ps.printf("X");
                    }
                    
                    if (0<i && i<(N+1)/2){
                        for (j=0;j<(N+1-2*i)/2;j++)
                            ps.printf("X");
                        ps.printf("/");
                        for (j=0;j<2*i-1;j++)
                            ps.print("*");
                        ps.print("\\");
                        for (j=0;j<(N+1-2*i)/2;j++)
                            ps.printf("X");
                    }
                    
                    if (i>(N+1)/2 && i<N+1){
                        for (j=0;j<i-(N+1)/2;j++)
                            ps.print("X");
                        ps.printf("\\");
                        for (j=0;j<2*N+1-2*i;j++)
                            ps.print("*");
                        ps.print("/");
                        for (j=0;j<i-(N+1)/2;j++)
                            ps.print("X");
                    }
                    ps.println();
                }
                
                
            }
            catch ( FileNotFoundException e){
                
            }
        }
    }
    
    
    public static void main(String[] args){
        printPattern("output.txt",1);
        
        
    }
}
