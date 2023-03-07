import java.util.*;
public class marc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cal[] = new int[n];
        for(int i=0 ; i<n ;i++)
        {
            cal[i] = sc.nextInt();
        }
        long sum = 0 ;
        long pow = 1;
        Arrays.sort(cal);
        for(int i=n-1 ; i>=0 ; i--)
        {
            sum += pow*cal[i];
            pow*=2;
        }
        System.out.println(sum);
        sc.close();
    }
}
