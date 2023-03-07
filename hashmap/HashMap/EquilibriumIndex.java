import java.util.*;

//import javax.security.auth.callback.TextOutputCallback;
public class EquilibriumIndex {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = Solution.findEquilibriumIndex(a);
        System.out.println(ans);
        sc.close();
    }
}
class Solution {
    static int findEquilibriumIndex(int[] a) {
        //Write code here
        int TotalSum = 0;
        for(int i: a){
            TotalSum+=i;
        }
        int cSum =0;
        for(int i=0 ; i<a.length ; i++){
            cSum+=a[i];

            int temp = TotalSum - cSum;
            if(temp+a[i] == cSum)
            return i;
        }
        return -1;
    }
}