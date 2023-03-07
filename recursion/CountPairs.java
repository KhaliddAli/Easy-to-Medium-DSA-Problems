public class CountPairs {
    public static void main(String[] args) {
        String s = "AxAxA";
        System.out.println(countPairs(s));
    }
    public static int countPairs(String str) {
        if(str.length()<=2){
            return 0;
        }
        int cnt =0;
        if(str.charAt(0) == str.charAt(2)){
            cnt++;
        }
        return cnt + countPairs(str.substring(1));
    }
}
