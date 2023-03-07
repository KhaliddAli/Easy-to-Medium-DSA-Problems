import java.util.*;

public class MostFrequentWordInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        String []arr = new String[n];
        for(int i=0;i<n;++i){
                arr[i] = sc.next();
        }
        mostFrequent(arr, n);
        sc.close();
    }

    public static void mostFrequent(String []arr, int n) {
        // write your code here
		Map<String , Integer> map = new HashMap<>();
		String ans = "";
        int max =0;
        for(String s : arr){
			map.put(s , map.getOrDefault(s, 0)+1);
            if(map.get(s)>=max){
                ans = s;
                max = map.get(s);
            }
        }
		System.out.println(ans);
    }
}
