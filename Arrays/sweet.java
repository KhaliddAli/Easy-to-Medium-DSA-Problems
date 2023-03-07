import java.util.*;;

public class sweet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , k ;
        n = sc.nextInt();
        k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        //System.out.println(Arrays.toString(arr));
        int cnt =0;
        int sum =0;
        for(int i=0 ; i<n-1 ; i++)
        {
            if(arr[i]>=k)
            {
                continue;
            }
            else{
                //System.out.println(i);
                if(sum>=k)
                {
                    sum =0;
                    continue;
                }
                sum = (1*arr[i] + 2*arr[i+1]);
                cnt++;
                
            }
        }
        
        System.out.println(cnt);
        sc.close();
    }
}
