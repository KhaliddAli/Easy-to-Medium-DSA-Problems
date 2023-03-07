
import java.util.*;

public class occ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        int c =1;
        int nm = arr[0];
        for(int i=1 ; i<n ; i++)
        {
            if(arr[i] == nm)
            {
                //System.out.println(arr[i]);
                continue;
            }
            else{
                nm = arr[i];
                c++;
            }
        }
    //System.out.println(c);

        int out[] = new int[c];
        int v = Integer.MIN_VALUE;
        int indx =0;
        for(int i=0 ; i<n ; i++)
        {
            int cnt =0;
            if(arr[i] == v){continue;}
            else{
                for(int j=0 ; j<n ; j++)
                {
                    if(arr[i] == arr[j]){cnt++;}
                }
                out[indx] = cnt;
                indx++;
                v = arr[i];
            }
        }
        for(int i=0 ; i<c ; i++)
        {
            System.out.print(out[i] + " ");
        }
        sc.close();
    }
}
