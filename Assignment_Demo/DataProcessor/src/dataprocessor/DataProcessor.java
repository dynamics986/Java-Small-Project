/**
 * CSCI1130 Assignment DataProcessor
 *
 * I declare that the assignment here submitted is original except for source
 * material explicitly acknowledged, and that the same or closely related
 * material has not been previously submitted for another course. I also
 * acknowledge that I am aware of University policy and regulations on honesty
 * in academic work, and of the disciplinary guidelines and procedures
 * applicable to breaches of such policy and regulations, as contained in the
 * website.
 *
 * University Guideline on Academic Honesty:
 *     http://www.cuhk.edu.hk/policy/academichonesty
 * Faculty of Engineering Guidelines to Academic Honesty:
 *     https://www.erg.cuhk.edu.hk/erg/AcademicHonesty
 *
 * Date        : 02/11/2024
 */
package dataprocessor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author fansixing
 */
public class DataProcessor {

    DataProcessor() throws FileNotFoundException {
        File fileObj = new File("table07.csv");
        Scanner reader = new Scanner(fileObj);
        reader.useDelimiter(","); // To read comma-separated values 

        // read and print the whole header line
        String header = reader.nextLine();
        System.out.println(header);

        while (reader.hasNextLine()) {
            int y = reader.nextInt();
            int r = reader.nextInt();
            reader.nextInt(); //we discard some values
            int c = reader.nextInt();
            reader.nextInt(); //we discard some values
            int i = reader.nextInt();
            reader.nextInt(); //we discard some values
            int t = reader.nextInt();
            reader.nextLine(); // discard the rest of the line

            EnergyUseRecord record0 = new EnergyUseRecord(y, r, c, i, t);
            // read and store data into new EnergyUseRecord objects
            System.out.println(record0.toString());
            // print the record object 
            System.out.println("Year " + record0.getYear() + " used "
                    + record0.getAnnualEnergyUse() + " TJ");
            // print the year and annual energy use 

        }
    }

    public static void main(String[] args) {
        try { // try-catch ALL kinds of Exception

            DataProcessor processor = new DataProcessor();
            // create a new DataProcessor object
            // let the DataProcessor constructor do its job

            EnergyUseRecord.printSummary(System.out);
            // printSummary to console System.out

            PrintStream Reference;
            Reference = new PrintStream("summary.txt");
            EnergyUseRecord.printSummary(Reference);
            // printSummary to file "output.txt" 
        } catch (FileNotFoundException exception) {
            System.err.println("Error processing data!");
            // printing "Error processing data!" to System.err
        } finally {
            System.exit(0);
            // terminate the app on all cases at the end
        }

    }

}
