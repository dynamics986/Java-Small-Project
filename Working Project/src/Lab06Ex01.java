import java.util.Scanner;

class Fraction {

    public int a;
    public int b;

    Fraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String printString() {
        String s = a + "/" + b;
        return s ;
    }

    public Fraction multiplyBy(Fraction other) {
        int newNumerator = this.a * other.a;
        int newDenominator = this.b * other.b;
        Fraction result = new Fraction(newNumerator, newDenominator);
        simplify(result);
        return result;

    }

    private static void simplify(Fraction fraction) {
        int divisor = Lab04Ex02.gcd(fraction.a, fraction.b);
        fraction.a /= divisor;
        fraction.b /= divisor;
    }
}

class Lab06Ex01 {

    public static void main(String[] args) {

        // Do not touch the following lines
        // 
        Scanner keyin = new Scanner(System.in);
        System.out.println("a? b? c? d?");
        int a, b, c, d;
        a = keyin.nextInt();
        b = keyin.nextInt();
        c = keyin.nextInt();
        d = keyin.nextInt();

        Fraction r, q, result;
        r = new Fraction(a, b);
        q = new Fraction(c, d);

        System.out.print(r.printString() + " x " + q.printString() + " = ");
        result = r.multiplyBy(q);
        System.out.println(result.printString());
        // The End 
    }
}
