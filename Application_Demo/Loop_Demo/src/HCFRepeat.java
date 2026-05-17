import javax.swing.JOptionPane;

class HCFRepeat {
    
    /* The HCF Program
     * Description: Calculates the highest common factor of two integers.
     * Aim: Illustrates do-while and while loop.
     */
    
    public HCFRepeat() {
        JOptionPane.showMessageDialog(null, "***** Finding the HCF *****");
        
        String input;
        
        // read 2 integers a abd b as an input string
        // we do the conversion from string to integer then
        input = JOptionPane.showInputDialog("Integer a");
        int a = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Integer b");
        int b = Integer.parseInt(input);
        
        int remainder;
        String output = "a        b\n";
        
        // make sure the larger number is stored in a
        if (a < b) {
            // swap/exchange a and b
            int temp = a;
            a = b;
            b = temp;
        }
        
        do {
            output += a + "        " + b + '\n';
            
            remainder = a % b;
            // we are going to keep (remainder, old_b) into (new_a, new_b);
            
            // make sure the larger number is still in a (new)
            a = b;
            b = remainder;
        } while (remainder > 0);
        
        JOptionPane.showMessageDialog(null, "Here is the result:\n" + output + "HCF = " + a);
    }
    
    public static void main(String args []) {
        new HCFRepeat();
        // highest common factor
    }
}
