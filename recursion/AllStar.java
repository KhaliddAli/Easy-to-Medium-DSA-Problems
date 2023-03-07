public class AllStar {
    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(allStar(s));
    }
    public static String allStar(String str) {
        if(str.length()==0){
            return "";
        }
        if(str.length()==1){
            return str.charAt(0) +"";
        }
        String s = str.charAt(0)+"*";
        return s + allStar(str.substring(1));
    }
}
