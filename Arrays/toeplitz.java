import java.util.*;

public class toeplitz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        for(int i=0 ; i<m ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        boolean res = true;
        for(int i=0 ; i<n ; i++)
        {
            int nm =a[0][i];
            for(int j=0 ; i+j<n && j<m ; j++)
            {
                if(nm != (a[j][j+i])){
                    res = false;
                    break;
                }
            }
        }
        for(int i=0 ; i<m ; i++)
        {
            int nm = a[i][0];
            for(int j=0 ; i+j<m && j<n ; j++)
            {
                if(nm!=a[j+i][j])
                {
                    res = false;
                    break;
                }
            }
        }
        System.out.println(res);
        sc.close();
    }
}
