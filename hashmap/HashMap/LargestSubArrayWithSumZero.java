import java.util.*;
public class LargestSubArrayWithSumZero {
    public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
		{
			nums[i] = sc.nextInt();
		}
       System.out.println(maxLen(nums));
        sc.close();
	}
    public static int maxLen(int arr[]){
        Map<Integer , Integer> map = new HashMap<>();
        int MaxLen = 0;
        int sum = 0;
        map.put(sum , -1);

        for(int i=0 ; i<arr.length ;i++){
            sum+=arr[i];

            if(map.containsKey(sum)){
                int len = i - map.get(sum);
                MaxLen = Math.max(MaxLen , len);
            }
            else{
                map.put(sum , i);
            }
        }
        return MaxLen;
    }
}

