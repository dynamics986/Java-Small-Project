package filedownloader;

import java.io.File;
import java.io.PrintStream;
import java.net.URL;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * File Downloader
 * @note Restricted to downloading text file
 */
public class FileDownloader {
    
    private static String DEFAULT_ADDRESS = "http://www.cse.cuhk.edu.hk/index.html";
    
    public void readDataFromURL(String address) {
        try {
            URL link = new URL(address);
            String filename = link.getFile();
            filename = filename.substring(filename.lastIndexOf('/') + 1);
            if (filename == null || filename.trim().isEmpty())
                filename = "download.out";
            else
                filename = "download_" + filename;
            
            JOptionPane.showMessageDialog(null, "Downloading [" + address + "] to file [" + filename + "]");

            Scanner dataReader = new Scanner(link.openStream());
            PrintStream file = new PrintStream(new File(filename));

            int fileSize = 0;
            while (dataReader.hasNextLine())
            {
                String aLine = dataReader.nextLine();
                file.println(aLine);
                fileSize += aLine.length() + 2;
            }
            
//            JOptionPane.showMessageDialog(null, "File [" + fileSize + " bytes] download completed!");
            JOptionPane.showMessageDialog(null, "Download completed!");
        }
        catch (Exception anExceptionObject) {
            // Exception is the general type to catch
            // it represents all kinds of Exception
            // we can print message from the exception object reference

            JOptionPane.showMessageDialog(null, "Something wrong happened: " + anExceptionObject);

        }
    }
    
    public static void main(String[] args) throws Exception
    {

        if (JOptionPane.showOptionDialog(null, "Sample Program is asking you:\nAre you in CSE lab?", "Proxy setting", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null) == JOptionPane.YES_OPTION)
        {
            // Dept of CS&E proxy settings
            System.getProperties().put("proxySet", "true");
            System.getProperties().put("proxyHost", "proxy.cse.cuhk.edu.hk");
            System.getProperties().put("proxyPort", "8000");
        }
        
        String address;

        address = (String) JOptionPane.showInputDialog(null, "Type an URL:", "Sample Program FileDownloader", JOptionPane.QUESTION_MESSAGE, null, null, "http://www.cse.cuhk.edu.hk/");
        FileDownloader rd = new FileDownloader();
        rd.readDataFromURL(address);
//        address = JOptionPane.showInputDialog("Type an URL:");
        
//        if (address == null || address.trim().isEmpty())
//            address = DEFAULT_ADDRESS;
    }
}
