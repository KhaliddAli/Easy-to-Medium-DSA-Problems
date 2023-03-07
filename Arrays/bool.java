import java.util.*;
public class bool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int matrix[][] = new int[m][n];
        for(int i=0 ; i<m ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0 ; i<m ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(matrix[i][j] == 1)
                {
                    for(int k=0 ; k<n ; k++ )
                    {
                        matrix[i][k] = 1;
                    }
                }
                
            }
            
        }
        for(int i=0 ; i<m ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                System.out.print(matrix[i][j] + " ");
                
            }
            System.out.println();
        }
        sc.close();
    }
}
