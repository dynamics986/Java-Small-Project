package dataprocessor;

import java.io.PrintStream;

/**
 *
 * @author fansixing
 */
public class EnergyUseRecord {

    private int year;
    private int residential;
    private int commercial;
    private int industrial;
    private int transport;

    private static int yearCount;
    private static int residentialCumulative;
    private static int commercialCumulative;
    private static int industrialCumulative;
    private static int transportCumulative;

    EnergyUseRecord(int y, int r, int c, int i, int t) {
        //Private integer instance fields
        //year, residential, commercial, industrial, transport.
        year = y;
        residential = r;
        commercial = c;
        industrial = i;
        transport = t;

        //Private integer class fields yearCount, residentialCumulative, 
        //commercialCumulative, industrialCumulative, transportCumulative.
        yearCount += 1;
        residentialCumulative += r;
        commercialCumulative += c;
        industrialCumulative += i;
        transportCumulative += t;

    }

    public int getYear() {
        return year;
    }

    public int getAnnualEnergyUse() {
        return residential + commercial + industrial + transport;
    }

    @Override
    public String toString() {
        String s = "Year %d - Res: %7d TJ Com: %7d TJ Ind: %7d TJ Trp: %7d TJ";
        String result = String.format(s, year, residential, commercial, industrial, transport);
        return result;
    }

    public static void resetCumulation() {
        //resets all class fields to zeroes
        yearCount = 0;
        residentialCumulative = 0;
        commercialCumulative = 0;
        industrialCumulative = 0;
        transportCumulative = 0;

    }

//    public static void main(String[] args) {
//        EnergyUseRecord record1997 = new EnergyUseRecord(1997, 1000, 2000, 3000, 4000);
//        System.out.println(record1997.toString()); // invoke toString() method 
//        EnergyUseRecord record2000 = new EnergyUseRecord(2000, 5000, 6000, 7000, 8000);
//        System.out.println(record2000); // invoke toString() method implicitly
//        System.out.println("Year " + record2000.getYear()
//                + " used " + record2000.getAnnualEnergyUse() + " TJ");
//        EnergyUseRecord.printSummary(System.out);
//        EnergyUseRecord.resetCumulation();
//        EnergyUseRecord.printSummary(System.out);
//        System.out.println(new EnergyUseRecord(2024, 5999, 6999, 7999, 8999));
//        EnergyUseRecord.printSummary(System.out);
//        EnergyUseRecord.resetCumulation();
//    }
    public static void printSummary(PrintStream ps) {
        ps.printf("There are %d records: \n", yearCount);
        //If yearCount is zero, output "Summary not available".
        if (yearCount == 0) {
            ps.println("Summary not available");
        } else {
            ps.printf("average(residential) = %7d TJ \n", residentialCumulative / yearCount);
            ps.printf("average(commercial) = %7d TJ \n", commercialCumulative / yearCount);
            ps.printf("average(industrial) = %7d TJ \n", industrialCumulative / yearCount);
            ps.printf("average(transport) = %7d TJ \n", transportCumulative / yearCount);

        }
    }

}
