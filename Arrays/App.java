import java.util.*;
//import java.lang.Math;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0 ; i<n ; i++)
    {
        arr[i] = sc.nextInt();
    }
    //System.out.println(Arrays.toString(arr));
    int peak = -1;
    if(arr[0]>arr[1])
    {
        peak = 0;
    }
    else
    {
        for(int i=1 ; i<=n-2;i++)
        {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
            {
                peak = i;
                break;
            }
        }
        if(peak==-1 && n>1)
        {
            peak = n-1;
        }

     }
     System.out.println(peak);
    sc.close();
    }
}
