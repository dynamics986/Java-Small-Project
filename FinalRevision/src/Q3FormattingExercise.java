/**
 * Check the print format of 8 examples
 */
public class Q3FormattingExercise {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        float a = 5.2f;

        // Corrected the string concatenation
        System.out.println("\"" + 'D' + ":\\n\\\"");
        // Cast y to float for precise division
        System.out.println(y / Math.ceil(x)); 
        
        // Test by Francis
        // Find that result of ceil and floor function is a double
        System.out.println(Math.ceil(x) + " and "+ x +" and " + Math.floor(x));
        
        // Character arithmetic
        System.out.println(x + "B" + ('A' - 'B')); 
        
        // Test by Francis, boolean printing
        System.out.println(true + " or " + (0.7 * 0.7 == 0.49));

        // Floor of negative float
        System.out.println(Math.floor(-a));

        // Unicode character, not easy!
        System.out.println('\u0040');
        
        // Test by Francis, unicode output
        System.out.println('\u0035'+ " and " + '\u0036');
        System.out.println('\u0035'+'\u0036');

        // Floating-point comparison, be cautious
        System.out.println(0.7 * 0.7 == 0.49); 

        // Integer division
        System.out.println(x / y);

        // Post-increment and pre-increment
        System.out.println((x++) + "&" + (++y)); 
    }
}

