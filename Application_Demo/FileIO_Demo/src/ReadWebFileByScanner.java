/**
 * Aim: to demonstrate the use of the class Scanner with a File on the Web
 * Note: throws Exception is a MUST because web, file and scanner operations may crash
 */

import java.io.InputStream;
import java.util.*;             // for using Scanner
import java.net.*;              // for opening Web
import javax.swing.JOptionPane; // for message Dialog

class ReadWebFileByScanner
{
    private static String markFileOnWeb = "http://course.cse.cuhk.edu.hk/~csci1130/lecture/Lecture5b_Demo/marks.txt";
    
    public static void main(String[] args) throws Exception
    {
        System.getProperties().put("proxySet", "true");
        System.getProperties().put("proxyHost", "proxy.cse.cuhk.edu.hk");
        System.getProperties().put("proxyPort", "8000");

        /* open the file with a new Scanner object */
        URL link = new URL(markFileOnWeb);
        InputStream in = link.openStream();
        Scanner markFile = new Scanner(in);
        
        int count = 0;
        String result = "";
        
        while (markFile.hasNextInt())  // check if there is more data
        {
            int mark;
            mark = markFile.nextInt(); // read an integer data
            count++;
            
            /* concatenate the result into a String */
            result += "Student " + count + " got " + mark + " marks\n";
        }
        
        result = "Got marks from " + markFileOnWeb + "\n\n" +
                 "There are " + count + " students:\n\n" + result;
        
        /* print the result on the screen */
        System.out.println(result);
        
        /* print also the result on a message dialog */
        JOptionPane.showMessageDialog(null, result);
    }
}
