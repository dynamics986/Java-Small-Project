package Francis_Project;

/**
 * Copy actual parameter to formal parameter when sending message.
 * Change to the formal parameter DOES NOT affect actual parameter!
 */
class oneStudent {

    public static void studyHard(double newGPA) {
        newGPA = 4.0;
    }

    public static void main(String[] args) {
        double GPA = 1.0;
        oneStudent.studyHard(GPA);
        // Primitive Type Argument Passing
        System.out.println(GPA);
    }
}

/**
 * Copy Primitive Type Array reference to formal parameter when sending message. Change to the
 * formal parameter DOES affect the actual parameter!
 */
class GroupStudent {

    public static void studyHard(double[] newGPAs) {
        newGPAs[0] = 4.0;
        newGPAs[1] = 4.0;
    }

    public static void main(String[] args) {
        double[] GPAs = new double[2];
        GPAs[0] = 1.6;
        GPAs[1] = 1.5;
        GroupStudent.studyHard(GPAs);
        // Primitive Type Array Argument Passing
        System.out.println(GPAs[0]);
        System.out.println(GPAs[1]);
    }
}

class Teacher {

    public static void fire(Employee[] victims) {
        for (int i = 0; i < victims.length; i++) {
            victims[i].salary = 0;
        }
    }

    public static void fire(Employee victim) {
        victim.salary = 0;
    }
    
    public static void main(String[] args) {
        Employee michael = new Employee(500);
        Teacher.fire(michael); // Object Type Argument Passing
        if (michael.salary == 0) {
            System.out.println("Fired!");
        }
        // The above is Object Type Argument Passing

        
        Employee[] TAs = new Employee[3];
        TAs[0] = new Employee(1000);
        TAs[1] = new Employee(2000);
        TAs[2] = new Employee(5000);
        Teacher.fire(TAs);
        // This is Object Type Array Argument Passing

        System.out.println(TAs[0].salary);
        System.out.println(TAs[1].salary);
        System.out.println(TAs[2].salary);
    }

}

class Employee {

    public int salary;

    public Employee(int initialSalary) {
        salary = initialSalary;
    }
}

