public class countABC {
    public static void main(String[] args) {
        String s= "abcxxabcxaba";
        System.out.println(countAbc(s));
    }
    //recursive code for count of abc and aba in a string
    public static int countAbc(String str) {
        if(str.length() <= 2){
            return 0;
        }
        int cnt=0;
        if(str.substring(0, 3).equals("abc")){
            cnt++;
            return cnt + countAbc(str.substring(2));
        }
        if(str.substring(0, 3).equals("aba")){
            cnt++;
            return cnt + countAbc(str.substring(2));
        }
        else{
            return cnt + countAbc(str.substring(1));
        }
    }
}
