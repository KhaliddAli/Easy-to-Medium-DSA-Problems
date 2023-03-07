import java.util.*;
public class sun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for(int i=0 ; i<n ; i++)
        {
            arr[i] = sc.nextLong();
        }
        long l = 1;
        int cnt =0;
        for(long i : arr)
        {
            if(i>l)
            {
                l = i;
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
