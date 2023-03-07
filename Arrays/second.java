import java.util.*;
public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(Anagram(s1,s2));
        sc.close();
    }
    public static boolean Anagram(String s1 , String s2)
    {
        
        if(s1.length() != s2.length()){
            return false;
        }
        else{
            //creating 2 frequency arrays to store the frequency
            int freq1[] = new int[256];
        int freq2[] = new int[256];
        boolean flag = true;
        //recording the freq od all the characters in s1
        for(int i =0 ; i<s1.length() ; i++){
            int index = s1.charAt(i);
            freq1[index]++;
        }
        //recording the freq od all the characters in s2
        for(int i=0 ; i<s2.length() ; i++){
            int index = s2.charAt(i);
            freq2[index]++;
        }
        //comparing the frequencies in both strings

        for(int i=0 ; i<freq1.length ; i++)
        {
            if(freq1[i] != freq2[i]){
                flag = false;
                break;
            }
        }
        return flag;
        }
    }
}
