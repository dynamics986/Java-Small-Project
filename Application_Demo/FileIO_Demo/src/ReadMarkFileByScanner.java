/**
 * Aim: to demonstrate the use of the class Scanner with a File
 * Note: throws Exception is a MUST because file and scanner operations may crash
 */

import java.util.*;             // for using Scanner
import java.io.*;               // for opening File
import javax.swing.JOptionPane; // for message Dialog

class ReadMarkFileByScanner
{
    private static final String markFileName = "marks.txt";
    
    public static void main(String[] args) throws Exception
    {
        /* open the file with a new Scanner object */
        File myFile = new File(markFileName);
        Scanner markFile = new Scanner(myFile);
        
//        Scanner markFile = new Scanner(new File(markFileName));
        
        int count = 0;
        String result = "";
        
        while (markFile.hasNextLong())  // check if there is more data
        {
            long mark;
            mark = markFile.nextLong(); // read an integer data
            count++;
            
            /* concatenate the result into a String */
            result += "Student " + count + " got " + mark + " marks\n";
        }
        
        result = "Got marks from " + markFileName + "\n\n" +
                 "There are " + count + " students:\n\n" + result;
        
        /* print the result on the screen */
        System.out.println(result);
        
        /* print also the result on a message dialog */
        JOptionPane.showMessageDialog(null, result);
    }
}
