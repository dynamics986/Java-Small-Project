import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Please implement all TODOs in the provided code skeleton
class Lab10Ex02 {

    public static void main(String[] args) {
        Scanner keyInput = new Scanner(System.in);
        String filename = keyInput.nextLine(); // read filename

        Scanner fileInput = null;
        String lineData;

        // open file
        try {
            fileInput = new Scanner(new File(filename)); // file reader
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
            System.exit(1);
        }

        while (fileInput.hasNext()) {
            // TODO read a line of log
            lineData = fileInput.nextLine();

            if (lineData.charAt(0) == '-' || lineData.charAt(0) == 'd') {
                // valid line
                
                int i = 1;
                if (lineData.charAt(0) == '-')
                    i = 0;
                // TODO get name entry (last part of the line)
                // Assume no space in name.
                String[] parts = lineData.split("\\s+"); // Split by spaces
                String name = parts[parts.length - 1]; // need to study

                // TODO 1. Filter out special case (1): 
                // hidden files/directories (names starting with ".")
                if (name.startsWith(".")) {
                    continue; // Skip hidden files/directories
                }

                // TODO 2. separately considers file and directory
                if (i == 0) {
                    System.out.println("file: " + name);
                    // TODO 4. print out processed name
                }
                
                // Directory case
                if (i == 1) {
                    if (name.endsWith("/")) {
                        // TODO 3. for directory, deal with case (2)
                        // Remove trailing "/" for directories
                        name = name.substring(0, name.length() - 1);
                    }
                    System.out.println("dir: " + name);
                    // TODO 4. print out processed name
                }
            }
        }
    }
}
