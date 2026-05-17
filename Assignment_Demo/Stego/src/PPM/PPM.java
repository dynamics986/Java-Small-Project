package PPM;

import java.awt.Color;

public class PPM {

    protected int w, h; // dimensions width w by height h
    protected int[][][] pixels;
    // [row][colomn][rgb] with index from 0 in row-major order

    // initializing a PPM object with all greenish pixels of the triple (0,255,0)
    public static void main(String[] args) {
       
        String s = "Justin Xin";
        String t = s.concat(" is stupid");
        
        System.out.println(t);
        System.out.println(s.contentEquals(t));
        System.out.println(t.repeat(4));
        
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.setLength(2);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
    
    public static void Test(){
        Color[] palette = {
            new Color(0, 0, 0),  new Color(255, 0, 0), new Color(0, 255, 0),
             new Color(0, 0, 255), new Color(255, 255, 255),null
        };
        System.out.println(palette[palette.length - 1]);
        System.out.println(palette.length);
        System.out.println(palette[5] instanceof Color);
        System.out.println(palette[4]==palette[4]);
        
        byte [][] id = {{1,1},{5},{5,0}};
        System.out.println(id.length);
        System.out.println(id[0].length);
        
        byte[] ref = id[2];
        ref[1] = 66; // share the same refence with id[2][1] 
        System.out.println(id[2][1]);
        
        String s = "stru", l = "666";
        System.out.println(s.length());
        s += '-' + "kalfjdsk";
        
        String copy = new String();
        copy += s;
        System.out.println(copy);
       
        System.out.println(s);
        
        System.out.println(id.getClass());
        
        double a[] = {0};
        System.out.println(a.getClass());
    } 

}
