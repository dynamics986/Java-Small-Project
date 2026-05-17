
package ProblemSolve;

// CSCI1130S Tutorial
// Solving Problems using exhausive search method
// Nested loops and Branching
// The following examples are coded in while-loops
// They can also be implemented using for-loops

public class ProblemSolverWithWhileLoop {

    public static void enumeration() {
        int i, j;
        i = 0;
        while (i < 3) {
            j = 0;
            while (j < 3) {
                System.out.println(i + " " + j);
                j++;
            }
            i++;
        }
    }

    public static void example1() {
        int A = 1, B, no_of_sol = 0;
        while (A <= 6) {
            B = 1;
            while (B <= 6) {
                if ((A - B >= 5) && (A * B <= 6)) {
                    System.out.println(A + " " + B);
                    no_of_sol++;
                }
                B++;
            }
            A++;
        }

        System.out.println(no_of_sol + " answer(s) found.");
    }

    public static void example2() {
        int x = 1;
        
        while(x < 20){
            int y = 1;

            while(y < 33){
                int z = 100 - x - y;

                if ((z % 3 == 0) && (x * 5 + y * 3 + z / 3 == 100)){
                    System.out.println("#Roosters:"+x+", #Hens:"+y+", #Chicken:"+z);
                }
                y++;
            }
            x++;
        }
    }
    
    public static void example3() {
        int A = 1, B, C, D, E, no_of_sol = 0;

        // enumerate all the rankings
        while (A <= 5) {
            B = 1;
            while (B <= 5) {
                if (B != A) {
                    C = 1;
                    while (C <= 5) {
                        if ((C != A) && (C != B)) {
                            D = 1;
                            while (D <= 5) {
                                if ((D != A) && (D != B) && (D != C)) {
                                    E = 1;
                                    while (E <= 5) {
                                        if ((E != A) && (E != B) && (E != C) && (E != D)) {
                                            if (((A == 3 ^ B == 2) && (B == 2 ^ E == 4))
                                                    && ((C == 1 ^ D == 2) && (D == 3 ^ C == 5))
                                                    && ((E == 4 ^ A == 1))) {
                                                System.out.println(A + " " + B + " " + C + " " + D + " " + E);
                                                no_of_sol++;
                                            }
                                        }
                                        E++;
                                    }
                                }
                                D++;
                            }
                        }
                        C++;
                    }
                }
                B++;
            }
            A++;
        }

        System.out.println(no_of_sol + " answer(s) found.");
    }

//    public static void classwork() {
//        int plant1 = 1, plant2, plant3, plant4;
//
//        while (plant1 <= 4) {
//            plant2 = 1;
//            while (plant2 <= 4) {
//                if ((plant2 != plant1)) {
//                    plant3 = 1;
//                    while (plant3 <= 4) {
//                        if ((plant3 != plant1) && (plant3 != plant2)) {
//                            plant4 = 1;
//                            while (plant4 <= 4) {
//                                if ((plant4 != plant1) && (plant4 != plant2) && (plant4 != plant3)) {
//                                    if (((plant3 == 2 ^ plant1 == 3) && (plant1 == 2 ^ plant3 == 4))
//                                            && ((plant2 == 2 ^ plant4 == 2) && (plant3 == 4 ^ plant2 == 1))) {
//                                        System.out.println("Explosion order of Plant 1: " + plant1);
//                                        System.out.println("Explosion order of Plant 2: " + plant2);
//                                        System.out.println("Explosion order of Plant 3: " + plant3);
//                                        System.out.println("Explosion order of Plant 4: " + plant4);
//                                    }
//                                }
//                                plant4++;
//                            }
//                        }
//                        plant3++;
//                    }
//                }
//                plant2++;
//            }
//            plant1++;
//        }
//
//    }

    public static void main(String[] args) {
        enumeration();
        example1();
        example2();
        example3();
//        classwork();
    }
}
