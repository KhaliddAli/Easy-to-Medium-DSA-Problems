import java.util.*;
public class PairDivisibleByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
		k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        if(Obj.arrayPairs(arr,k)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
        sc.close();
    }
}

class Solution {
    public boolean arrayPairs(int[] arr, int k) {
		// write code here
        HashMap<Integer , Integer> remainder = new HashMap<>();

        for(int i: arr){
            int rem = i%k;
            remainder.put(rem , remainder.getOrDefault(rem, 0)+1);
        }

        for(int rem: remainder.keySet()){
            if(rem==0){
                continue;
            }
            int cr = k-rem;

            if(!remainder.containsKey(cr)){
                return false;
            }
            else if(remainder.get(cr) != remainder.get(rem)){
                return false;
            }

        }
        return true;
		
    }
}