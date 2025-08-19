import java.util.Scanner; 

public class Lab04Ex02 {
  /*
   * @param x integer input
   * @param y integer input
   * @return an integer as the GCD of x and y
   * You don't have to modify this function
   */
  public static int gcd(int x, int y) {
    // The following implements the Euclidean Algorithm for finding GCD
    // See: https://en.wikipedia.org/wiki/Euclidean_algorithm
    while (y != 0) {
      int tmp = y;
      y = x % y;
      x = tmp;
    }
    return x;
  }
    
  /*
   * @param x integer input
   * @param y integer input
   * @return an integer as the LCM of x and y
   */
  public static int lcm(int x, int y) {
    // LCM(x, y) = (x * y) / GCD(x, y).
    int lcm;
    lcm = (x * y) / gcd(x, y);
    return lcm;
  }
  
  // compute the gcc and lcm for four input values here
  public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int d = scan.nextInt();
        
    // GCD(a, b, c, d) = GCD( GCD( GCD(a, b), c), d)
    int gcd4 = gcd( gcd( gcd(a, b), c), d);
    System.out.println("GCD is " + gcd4);
    // LCM(a, b, c, d) = LCM( LCM( LCM(a, b), c), d)
    int lcm4 = lcm( lcm( lcm(a, b), c), d);
    System.out.println("LCM is " + lcm4);
    
  }    
}
