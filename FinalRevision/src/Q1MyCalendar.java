/**
 * Calendar class to handle year-related operations.
 */

public class Q1MyCalendar {
    private int year;

    /**
     * A Constructs 1: a MyCalendar object with the specified year.
     * @param y The year for the calendar.
     * @throws IllegalArgumentException if the year is not between 1900 and 2200.
     * @print "Year must be between 1900 and 2200"
     */
    public Q1MyCalendar(int y) {
        // Write your code here of IllegaArithmetticException
        if (1900<=y && y<=2200){
            this.year = y;
        }
        else {
            System.out.println("Year must be between 1900 and 2200");
            throw new IllegalArgumentException();
        }
        
    }

    /**
     * A Constructor2: creates a new MyCalendar object based on another MyCalendar object.
     * @param cal The MyCalendar object to copy.
     */
    public Q1MyCalendar(Q1MyCalendar cal) {
        this.year = cal.year;
        // Write your code here to initialize year of calender instance
    }

    /**
     * B Determines if the year in this calendar is a leap year.
     * @return true if this year is a leap year, false otherwise.
     */
    public boolean isLeapYear() {
        // A leap year is exactly divisible by 4 but not by 100;
        // OR it is exactly divisible by 400.
        boolean b = false;
        if (year % 4 == 0 && year % 100 != 0){
            b = true;
        }
        if (year % 400 == 0){
            b = true;    
        }
        return b;
    }

    // Main method
    public static void main(String[] args) {
        try {
            // Some test examples
            Q1MyCalendar calendar1800 = new Q1MyCalendar(1800);
            System.out.println("Is 1800 a leap year? " + calendar1800.isLeapYear()); 
            
            Q1MyCalendar calendar2300 = new Q1MyCalendar(2300);
            System.out.println("Is 2300 a leap year? " + calendar2300.isLeapYear());
            
            Q1MyCalendar calendar2020 = new Q1MyCalendar(2020);
            System.out.println("Is 2020 a leap year? " + calendar2020.isLeapYear());

            Q1MyCalendar calendar2021 = new Q1MyCalendar(2021);
            System.out.println("Is 2021 a leap year? " + calendar2021.isLeapYear());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
