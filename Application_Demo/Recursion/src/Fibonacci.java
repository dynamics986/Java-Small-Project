
class Fibonacci {
    public static void main(String[] args)
    {
        System.out.println("Fibonacci Sequence");
        System.out.println("f(n) = f(n - 2) + f(n - 1)");
        for (int i = 0; i < 10; i++)
            System.out.println(f(i));
    }
    
    public static int f(int n)
    {
        if (n < 0)
            throw new ArithmeticException("Negative n!");
        switch (n)
        {
            case 0: return 1;
            case 1: return 1;
        }
        return f(n - 2) + f(n - 1);
    }
}
