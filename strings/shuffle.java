import java.util.*;

public class shuffle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char out[] = new char[n];
        for(int i=0 ; i<n ; i++)
        {
            int inp = sc.nextInt();
            out[inp] = s.charAt(i);
        }
        System.out.println(out);
        sc.close();

    }
}