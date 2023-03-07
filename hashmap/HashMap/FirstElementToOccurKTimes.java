import java.util.*;
class Solution {
    public void firstElementToOccurKTimes(int[] nums, int n, int k) {
        // Your code here
		Map<Integer,Integer> map = new HashMap<>();

        for(int i=0 ; i<n ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i], 0)+1);
            if(map.get(nums[i])==k){
                System.out.println(nums[i]);
                return;
            }
        }
        System.out.println(-1);
    }
}

public class FirstElementToOccurKTimes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Solution Obj = new Solution();
        Obj.firstElementToOccurKTimes(nums,n,k);  
        System.out.println();
        sc.close();
    }
}