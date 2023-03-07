import java.util.*;
public class alt_mtrx_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int ds = 0;
        int s = 0;
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(i==j || i+j == n-1)
                {
                    ds+=arr[i][j];
                }
                else{s+=arr[i][j];}
            }
        }
        System.out.println(ds);
        System.out.println(s);
        sc.close();
    }
}
