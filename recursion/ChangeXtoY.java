public class ChangeXtoY {
    public static void main(String[] args) {
        String s = "abxcdxhjxxik";
        System.out.println(changeXY(s));
    }
    public static String changeXY(String str) {
        if(str.length()==0){
            return "";
        }
        if(str.charAt(0)=='x'){
            return "y" + changeXY(str.substring(1));
        }
        else{
            return str.charAt(0) +"" + changeXY(str.substring(1));
        }
    }
}
