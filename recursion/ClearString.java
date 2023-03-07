public class ClearString {
    public static void main(String[] args) {
        String s = "yybscdd";
        System.out.println(stringClean(s));
    }
    public static String stringClean(String str) {
        if(str.length()==0){
            return "";
        }
        if(str.length() == 1){
            return str.charAt(0)+"";
        }
        String out = "";
        if(str.charAt(0)==str.charAt(1)){
            out = "" + stringClean(str.substring(1));
        }
        else{
            out = str.charAt(0) + "" + stringClean(str.substring(1));
        }
        return out;
    }
}
