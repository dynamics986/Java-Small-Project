/**
 * Understanding OOP
 */

public class Q4RobotDemo {
    public static void main(String[] args) {
        // A: Run and check the output
        Q4Robot[] robots = new Q4Robot[4];

        Q4Robot r = new Q4Robot(20, "R1");
        robots[0] = robots[1] = r;
        robots[2] = new Q4FlyingRobot(20, "F1");
        robots[3] = new Q4SmartRobot(20, "S1", "Java");

        for (int i = 0; i < robots.length; i++) {
            robots[i].move();
            robots[i].charge(15);
        }

        // B: 
        /* 1. N: Compilation error */
//        Q4FlyingRobot ref_F = robots[1];
        // Q4Robot cannot be converted to Q4FlyingRobot


        /* 2. Y */
//        ((Q4SmartRobot)robots[3]).program();


        /* 3. N: Runtime error */
//        Q4Robot ref_R = (Q4FlyingRobot)robots[0];
        //  class Q4Robot cannot be cast to class Q4FlyingRobot 
        // (Q4Robot and Q4FlyingRobot are in unnamed module of loader 'app')
      

   }
}
