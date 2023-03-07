public class EndX {
    public static void main(String[] args) {
        String s = "avxxdhd";
        System.out.println(endX(s));
    }
    public static String endX(String str) {
        if(str.length()==0){
            return "";
        }
        String sAns ="";
        if(str.charAt(0) =='x'){
            sAns = endX(str.substring(1));
            return sAns + "x" ;
        }
        else{
            sAns = str.charAt(0) + endX(str.substring(1));
            return sAns;
        }
    }
    
}
