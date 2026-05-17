package Francis_Project;

public class Practice1 {

    public static void main(String[] args) {
//        Datatype();
//        TestPrint.Execute();
//        TestCopy.Execute();
        
    }
    
    
    public static void Datatype(){
        /* testing of primitive data types */
        byte int8 = -128;
        System.out.println(int8);
        int8 = (byte) 137;
        /* type casting with an overflow */
        System.out.println(int8);
        boolean ok = (3 < 7);
        /* boolean expression */
        System.out.println(ok);
        System.out.println("Hello \"World\" !!!");
        double GPA = 3;
        System.out.println("GPA = " + GPA);
        System.out.println("(int)(5.23)      = " + (int) (5.23));
        System.out.println("Math.floor(5.23) = " + Math.floor(5.23));
        System.out.println("Math.ceil(5.23)  = " + Math.ceil(5.23));
        System.out.println("Math.round(5.23) = " + Math.round(5.23));
        System.out.println("(int)(-5.83)      = " + (int) (-5.83));
        System.out.println("Math.floor(-5.83) = " + Math.floor(-5.83));
        System.out.println("Math.ceil(-5.83)  = " + Math.ceil(-5.83));
        System.out.println("Math.round(-5.83) = " + Math.round(-5.83));
        
        double p = 7.0 * 1 + .958;
        System.out.println(p);
        System.out.println(3e-1);
        System.out.println(3e-1 * 100.);
        System.out.println(Math.toRadians(3e-1 * 100.)); // no need to import anything
        System.out.println(Math.round(Math.pow(2+3, 2)));
        System.out.println(Math.pow(2+3, 2));
        
//        short s = 1;
//        s = s + 1; // cannot convert from int to short
//        s += 1; // inplicit type casting

        System.out.println((double)9/ (short)4f);
        
        byte b1 = (byte)1000000256;
        //When cast to byte, it wraps around using modulo 256
        byte b2 = (byte)1100000256;
        byte c1 = (byte)255;
        short d1 = 255;
        
        System.out.println(b1+"|"+b2+"|"+c1+"|"+d1);
    }
}


class TestPrint {
    public static void Execute(){
        double threshold = 0.0000001;
        System.out.println(0.7 * 0.7);
        System.out.println(0.700000 * 0.700000);
        System.out.println(0.49);
        boolean isSame = Math.abs(0.7 * 0.7-0.49) < threshold;
        System.out.println(isSame);
        
        
        int year = 651;
        int residential = 139823221;
        String s = "Year %d - Res: %7d TJ";
        String result = String.format(s, year,residential);
        System.out.println(result);
    
        System.out.printf("\\\n");
        System.out.printf("%c\\n", 53 + '\'');
        System.out.println();
        System.out.printf("%c\\n",'\\');
        
    }
        
}

class TestCopy{
    public static void Execute(){
        int i = 0, j, k;
        j = i;
        i += 12;
        k = j;
        i *= 2;
        System.out.println(i + " " + j + " " + k);
    }   
}



