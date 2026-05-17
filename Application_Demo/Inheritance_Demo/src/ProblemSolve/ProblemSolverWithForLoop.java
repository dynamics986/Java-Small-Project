
package ProblemSolve;

// CSCI1130 Tutorial
// Solving Problems using exhausive search method
// Nested loops and Branching
// The following examples are coded in for-loops
// They can also be implemented using while-loops
public class ProblemSolverWithForLoop {

    public static void enumeration() {
        int i, j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println(i + " " + j);
            }
        }
    }

    public static void example1() {
        int A, B, no_of_sol = 0;
        for (A = 1; A <= 6; A++) {
            for (B = 1; B <= 6; B++) {
                if ((A - B >= 5) && (A * B <= 6)) {
                    System.out.println(A + " " + B);
                    no_of_sol++;
                }
            }
        }
        System.out.println(no_of_sol + " answer(s) found.");
    }
    
    public static void example2() {
        int x, y, z;

        for (x = 1; x < 20; x++) {
            for (y = 1; y < 33; y++) {
                z = 100 - x - y;
                
                if ((z % 3 == 0) && (x * 5 + y * 3 + z / 3 == 100)){
                    System.out.println("#Roosters:"+x+", #Hens:"+y+", #Chicken:"+z);
                }
            }
        }
    }

    public static void example3() {
        int A, B, C, D, E, no_of_sol = 0;

        // enumerate all the rankings
        for (A = 1; A <= 5; A++) {
            for (B = 1; B <= 5; B++) {
                if (B != A) {
                    for (C = 1; C <= 5; C++) {
                        if ((C != A) && (C != B)) {
                            for (D = 1; D <= 5; D++) {
                                if ((D != A) && (D != B) && (D != C)) {
                                    for (E = 1; E <= 5; E++) {
                                        if ((E != A) && (E != B) && (E != C) && (E != D)) {
                                            if (((A == 3 ^ B == 2) && (B == 2 ^ E == 4))
                                                    && ((C == 1 ^ D == 2) && (D == 3 ^ C == 5))
                                                    && ((E == 4 ^ A == 1))) {
                                                System.out.println(A + " " + B + " " + C + " " + D + " " + E);
                                                no_of_sol++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(no_of_sol + " answer(s) found.");
    }

//    public static void classwork() {
//        int plant1, plant2, plant3, plant4;
//
//        for (plant1 = 1; plant1 <= 4; plant1++) {
//            for (plant2 = 1; plant2 <= 4; plant2++) {
//                if (plant2 != plant1) {
//                    for (plant3 = 1; plant3 <= 4; plant3++) {
//                        if ((plant3 != plant1) && (plant3 != plant2)) {
//                            for (plant4 = 1; plant4 <= 4; plant4++) {
//                                if ((plant4 != plant1) && (plant4 != plant2) && (plant4 != plant3)) {
//                                    if (((plant3 == 2 ^ plant1 == 3) && (plant1 == 2 ^ plant3 == 4))
//                                            && ((plant2 == 2 ^ plant4 == 2) && (plant3 == 4 ^ plant2 == 1))) {
//                                        System.out.println("Explosion order of Plant 1: " + plant1);
//                                        System.out.println("Explosion order of Plant 2: " + plant2);
//                                        System.out.println("Explosion order of Plant 3: " + plant3);
//                                        System.out.println("Explosion order of Plant 4: " + plant4);
//
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
        enumeration();
        example1();
        example2();
        example3();
//        classwork();
    }
}
