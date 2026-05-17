
public class Recursion {
    public static void main(String[] args)
    {
        recurse(9);
        System.out.println();
        recurse(5);
    }
    
    public static void recurse(int n)
    {
        if (n <= 0)
            System.out.println();
        else
        {
            System.out.print("#" + n);
            recurse(n - 1);
            System.out.print("*" + n);
        }
        return;
    }
}
