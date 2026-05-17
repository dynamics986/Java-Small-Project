
package Francis_Project;

/**
 *
 * @author fansixing
 */
public class Octopus {

    public static void main(String[] args) {
        
        //passing 
        int[] i = new int[3];
        int[] j;
        j = i;  // object reference copying
        
        j[2] = 9;  // i[2] = 9
        i[1] = 7;  // j[1] = 7
        j[0] = 7;  // i[0] = 7
        for (int k =0; k<3;k++){
            System.out.println("i["+k+"] = "+i[k]);
            System.out.println("j["+k+"] = "+j[k]);
            
        }
        
        
    }
}
