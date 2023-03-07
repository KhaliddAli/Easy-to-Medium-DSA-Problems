import java.util.*;
public class SmallestSubstringWithAllCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();
        System.out.println(SmallestSubstring(a, b));
        sc.close();
    }
    public static String SmallestSubstring(String a, String b) {
        // Write your code here
        HashMap<Character , Integer> freq = new HashMap<>();
        for(int i=0 ; i<b.length() ; i++){
            char ch = b.charAt(i);
            freq.put(ch , freq.getOrDefault(ch, 0)+1);
        }
        int i = -1;
        int e = -1;

        int rCnt = b.length();
        int cnt =0;

        HashMap<Character , Integer> map = new HashMap<>();
        String ans ="";

        while( true ){
            
            boolean f1 = false;
            boolean f2 = false;
            //Inclue
            while(i<a.length()-1 && cnt<rCnt){
                i++;
                char ch = a.charAt(i);
                map.put(ch , map.getOrDefault(ch, 0)+1);
                //checking if the character is present in b string
                if(map.get(ch)<= freq.getOrDefault(ch, 0)){
                    cnt++;
                }
                f1 = true;
            }
            //Exclude
            while(e<i && (cnt== rCnt)){
                String currAns = a.substring(e + 1, i + 1);
                if (ans.length() == 0 || ans.length() > currAns.length()) {
                    ans = currAns;
                }
                e++;
                char ch = a.charAt(e);

                map.put(ch , map.getOrDefault(ch, 0)-1);

                if(freq.containsKey(ch) && freq.get(ch)>map.get(ch)){
                    cnt--;
                }
                if(map.get(ch)==0){
                    map.remove(ch);
                }

                f2 = true;
            }
            if(f1==false && f2==false) break;
        }
        return ans;
    }
}
