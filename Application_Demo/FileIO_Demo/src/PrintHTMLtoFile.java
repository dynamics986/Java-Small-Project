/**
 * Aim: to demonstrate the use of the class PrintStream with a filename
 * Note: throws IOException is a MUST because file operations may crash
 */

import java.io.*;

class PrintHTMLtoFile
{
    public static void printContent(PrintStream contentOut)
    {
        System.out.println("I'm printing things!");
        contentOut.println("<HTML>");
        contentOut.println("<BODY>");
        contentOut.println("<TITLE>PrintHTMLtoFile result</TITLE>");
        contentOut.println("<H1>Hello, my name is Michael!</H1>");
        contentOut.println("</BODY>");
        contentOut.println("</HTML>");
    }
    
    public static void main(String[] args) throws IOException
    {
        /* create a new file "myWeb.html" to keep the content to be printed */
        PrintStream myNewFile;
        myNewFile = new PrintStream("myWeb.html");
        
        printContent(myNewFile);

        /* print also the content to the screen System.contentOut */
        printContent(System.out);

        /* create another new file "yourWeb.html" to keep the content to be printed */
        PrintStream yourNewFile = new PrintStream("yourWeb.html");
        printContent(yourNewFile);
    }

}