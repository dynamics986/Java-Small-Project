package Francis_Project;
import java.util.Scanner;

/**
 *
 * @author fansixing
 */
public class StringProcess {
    public static void main(String[] args){
        // StringMethod();
        TestReference();
    }
    
    public static void TestReference(){
        String original1 = "Java_CSCI1130";
        String copy1 = original1; // copy is a reference to the same object
        // If you want to determine if two String references 
        // point to the same object, you can use the == operator
        System.out.println("two String references are the same: "+ (copy1 == original1));
    
//        System.out.println("original1: " +original1.hashCode()); 
//        System.out.println("copy1    : " +copy1.hashCode());
//        
//        // These methods do not provide the actual memory address 
//        // but can serve as references to distinguish different objects.
//        System.out.println("original1: " +System.identityHashCode(original1));
//        System.out.println("copy1    : " +System.identityHashCode(copy1) );
//        System.out.println();
        
        
        String original2 = "Java_CSCI1130";
        String copy2 = new String(original2); // Creates a new String object
        System.out.println("two String references are the same: "+ (copy2 == original2));
        
//        System.out.println("original2: " + original2.hashCode()); 
//        System.out.println("copy2    : " + copy2.hashCode());
//        
//        System.out.println("original2: " +System.identityHashCode(original2));
//        System.out.println("copy2    : " +System.identityHashCode(copy2) );
//        System.out.println();
        
        String original3 = "Java_CS";
        String copy3 = String.valueOf(original3);
        System.out.println("two String references are the same: "+ (copy3 == original3));
        
//        System.out.println("original3: "+ original3.hashCode()); 
//        System.out.println("copy3    : "+ copy3.hashCode());
//        // These methods do not provide the actual memory address 
//        // but can serve as references to distinguish different objects.
//        
//        System.out.println("original3: "+System.identityHashCode(original3) );
//        System.out.println("copy3    : "+System.identityHashCode(copy3) );
//        System.out.println();
//        
//        System.out.println("value: "+String.valueOf("skafjhdskla").hashCode());
//        System.out.println("value: "+String.valueOf("skafjhdskla".hashCode()));
        // The above two lines are different
        
        
        System.out.println("1 and 2 are the same: "+ (original1 == original2));
        System.out.println("1 and 3 are the same: "+ (original1 == original3));
        System.out.println("2 and 3 are the same: "+ (original2 == original3));
        
    }
    
    public static void StringMethod(){
        /** s.trim()
         *  s.split()
         *  s.splitWithDelimiters()
         */
        String s = " Jus,ti,n X,in, ";
        
        System.out.println(s.trim());
        String[] s1 = s.split(",");
        for(int i=0; i<s1.length; i++) {
            System.out.print("["+s1[i]+"]");
        }
        System.out.println();
        
        String[] s2 = s.split(",", 2);
        for(int i=0; i<s2.length; i++) {
            System.out.print("["+ s2[i] +"]");
        }
        System.out.println();
        
        String[] s3 = s.splitWithDelimiters(",", 0);
        for(int i=0; i<s3.length; i++) {
            System.out.print("["+s3[i]+"]");
        }
        System.out.println();
        

        String input = "apple,banana;orange|grape";
        Scanner scanner = new Scanner(input);
        
        
        //scanner.useDelimiter("[,;|]");
        //scanner.useDelimiter(" ");

        while (scanner.hasNext()) {
            String fruit = scanner.next();
            System.out.println(fruit);
        }

        scanner.close();
    
        
    }
}
