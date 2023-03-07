public class PairStar {
    public static void main(String[] args) {
        String s = "abccaabcc";
        System.out.println(pairStar(s));
    }
    public static String pairStar(String str) {
        if(str.length() == 1){
            return str.charAt(0) + "";
        }
        String s ;
        if(str.charAt(0) == str.charAt(1)){
            s = str.charAt(0) + "*";
            return s + pairStar(str.substring(1));
        }
        else{
            s = str.charAt(0) + "";
            return s + pairStar(str.substring(1));
        }
        
    }
}
