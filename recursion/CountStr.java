public class CountStr {
    public static void main(String[] args) {
        
    }
    public static int strCount(String str, String sub) {
        if(str.length()<=sub.length()){
            return 0;
        }
        int cnt =0;
        if(str.substring(0,sub.length()).equals(sub)){
            cnt++;
            return cnt + strCount(str.substring(sub.length()), sub) ;
        }
        return cnt + strCount(str.substring(1), sub);
    }
}
