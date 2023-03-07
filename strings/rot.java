import java.util.*;
public class rot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(rotate(s));
        sc.close();
    }
    public static String rotate(String s)
    {
            char a[] = s.toCharArray();
            char res[] = new char[a.length];
            res[0] = a[a.length -1];
            for(int i=1 ; i<a.length ; i++)
                    {
                            res[i] = a[i-1];
                    }
            String st = new String(res);
            return st;
    }
    
}