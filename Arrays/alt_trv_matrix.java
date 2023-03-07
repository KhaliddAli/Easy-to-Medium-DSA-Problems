import java.util.*;
public class alt_trv_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<m ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0 ; i<n ; i++)
        {
            if(i%2!=0)
            {
                for(int j=m-1; j>=0 ; j--)
                {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else{
                for(int k=0 ; k<m ; k++)
                {
                    System.out.print(arr[i][k]+ " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
