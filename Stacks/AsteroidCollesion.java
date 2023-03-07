import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] a) {
        //Write code here
		Stack<Integer> st = new Stack<>();
		for(int i=0 ; i<a.length ; i++){
			if(a[i]>0) st.push(i);
			else{
				if(a[st.peek()]<0) st.push(i);
				while(st.size()>0 && a[st.peek()]>0){
				int idx = st.pop();
				int x = a[idx];
				int y = Math.abs(a[i]) > x? i: idx ;
				st.push(y);
				}
			}
			
		}
		int ans[] = new int[st.size()];

		for(int i=st.size()-1 ; i>=0 ; i--){
			ans[i] = a[st.pop()];
		}
		return ans;
    }
}

public class AsteroidCollesion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        int[] result = Obj.asteroidCollision(arr);
        for (int i = 0; i < result.length; ++i)
            System.out.print(result[i] + " ");
        System.out.println();
        sc.close();
    }
}