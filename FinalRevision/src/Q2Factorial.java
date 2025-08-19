
public class Q2Factorial {

    private int n;

    public Q2Factorial(int i) {
        n = i;
    }

    public long getValue() {
        if (n < 0) {
            throw new ArithmeticException("WRONG !");
        }
        if (n == 0) {
            return 1;
        }
        return n * new Q2Factorial(n - 1).getValue();
    }

    @Override
    public String toString() {
        if (n < 0) {
            return "Invalid: " + n + "!";
        }
        if (n == 0) {
            return "0!";
        }
        //defined by Francis
        if (n == 1){
            return "1";
        }
        // Modification Ended
        return new Q2Factorial(n - 1) + "x" + n;
    }

    public static void main(String[] args) {
        Q2Factorial f0 = new Q2Factorial(0);
        Q2Factorial f1 = new Q2Factorial(1);
        Q2Factorial f6 = new Q2Factorial(6);
        Q2Factorial fn999 = new Q2Factorial(-999);
        System.out.println(f0 + " = " + f0.getValue());
        System.out.println(f1 + " = " + f1.getValue());
        System.out.println(f6 + " = " + f6.getValue());
        try {
            System.out.println(fn999.getValue());
        } catch (ArithmeticException e) {
            System.out.println(fn999);
        }
        System.out.println(f6.getValue() / new Q2Factorial(4).getValue());
    }
}
