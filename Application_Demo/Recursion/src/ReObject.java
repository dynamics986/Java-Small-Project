
public class ReObject {
    protected int n;
    
    public static void main(String[] args)
    {
        ReObject a = new ReObject(9);
        System.out.println(a);
    }
    
    public ReObject(int n)
    {
        this.n = n;
    }
    
    public String toString()
    {
        if (n <= 0)
            return "***";
        
        ReObject b = new ReObject(n - 1);
        String result = "#" + n + b;
        return result;
    }
}
