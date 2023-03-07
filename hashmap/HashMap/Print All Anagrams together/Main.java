
// A Java program to print all anagrams together
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] wordArr = new String[n];
        for (int i = 0; i < n; i++)
            wordArr[i] = sc.next();
        sc.close();
        printAnagramsTogether(wordArr, n);
    }

    // Given a list of words in wordArr[],
	static String Sort(String s){
		char c[] = s.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
    static void printAnagramsTogether(String wordArr[],
            int size) {
        //your code here
		HashMap<String , ArrayList<String>> map = new HashMap<>();
		for(String s : wordArr){
			String sorted = Sort(s);
			if(map.containsKey(sorted)){
				ArrayList<String> temp = map.get(sorted);
				temp.add(s);
				map.put(sorted , temp);
			}
			else{
				ArrayList<String> temp = new ArrayList<>();
				temp.add(s);
				map.put(sorted , temp);
			}
		}
		for(String s : map.keySet()){
			for(String i : map.get(s)){
				System.out.print(i+" ");
			}
		}
    }
}