
import java.util.*;             // for using Scanner
import java.io.*;		// for opening File

class Lab06Ex02 {

    private static String numFileName = "numbers.txt";

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        System.out.printf("Start? ");
        int start = input.nextInt();
        System.out.printf("End? ");
        int end = input.nextInt();
        Scanner readFile = new Scanner(new File(numFileName));

        String aLine;
        int currentLine = 1;

        while (readFile.hasNextLine()) {
            aLine = readFile.nextLine();
            if (currentLine >= start && currentLine <= end) {
                processLine(aLine);
            } else if (currentLine > end) {
                break;
            }

            currentLine++;

        }

    }

    private static void processLine(String line) {
        Scanner linereader = new Scanner(line);
        int x = linereader.nextInt();
        int y = linereader.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.print(y + " ");
        }
        System.out.println();
    }

}
