
import java.util.*;
public class ptice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = sc.next();
        String A = "ABC";
        String B = "BABC";
        String G = "CCAABB";
        int m1 =0;
        int m2 =0;
        int m3 =0;


        for(int i=0 ; i<n ; i++)
        {
            if(ans.charAt(i) == A.charAt(i%3))
            {
                m1++;
            }
            if(ans.charAt(i) == B.charAt(i%4))
            {
                m2++;
            }
            if(ans.charAt(i) == G.charAt(i%6))
            {
                m3++;
            }
        }

        int max = m1>m2 ? m1: (m2>m3 ? m2:m3);
        System.out.println(max);

        if(m1 == max)
        {
            System.out.println("Adrian");
        }
        if(m2 == max)
        {
            System.out.println("Bruno");
        }
        if(m3 == max)
        {
            System.out.println("Goran");
        }


        sc.close();
    }
}
