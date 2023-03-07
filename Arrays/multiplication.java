import java.util.*;

public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {

            int n = sc.nextInt();
            int a[][] = new int[n][n];
            int b[][] = new int[n][n];
            for(int i=0 ; i<n ; i++)
            {
                for(int j=0 ; j<n ; j++)
                {
                    a[i][j] = sc.nextInt();
                }
            }
            for(int i=0 ; i<n ; i++)
            {
                for(int j=0 ; j<n; j++)
                {
                    b[i][j] = sc.nextInt();
                }
            }
            int res[][] = new int[n][n];
            int r = 0;
            
            while(r<n)
            {
                int c =0;
                while(c<n){
                for(int i=0 ; i<n ; i++)
                {
                    res[r][c] += a[r][i]*b[i][c];
                    //System.out.println(res[r][c] + " res");
                }
                c++;
                //System.out.println(c + " c");
            }
            r++;
            //System.out.println(r+ " r");
            }
            for(int i=0 ; i<n ; i++)
            {
                for(int j=0 ; j<n; j++)
                {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
            t--;
        }
        sc.close();
    }
}
