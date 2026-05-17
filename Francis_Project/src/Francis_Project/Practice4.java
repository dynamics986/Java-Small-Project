package Francis_Project;

public class Practice4 {
    public static void main(String[] args){
        Practice4 p = new Practice4();
        Practice4 q = new Practice4();
        Practice4 k = q;
        System.out.println(k);
        System.out.println(q);
        
        /**
         * switch mechanism
         */
        
        char receipe = ' ';
        switch (receipe) {
            case 'b':
                System.out.println('@');
            default:
                System.out.println('#');
            case ' ':
                System.out.println("!");
                break;
        }

        int day = 1; // Example value for the day of the week

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                
            case 3:
                System.out.println("Wednesday");
                
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;

        }
    }
}
