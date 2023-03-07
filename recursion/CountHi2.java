public class CountHi2 {
    public static void main(String[] args) {
        String s = "xhixaahijhixhi";
        System.out.println(countHi2(s));
        System.out.println(countHi(s));
    }
    //recursive code for count hi
    public static int countHi(String str) {
        if(str.length()<=1){ return 0; }
        int cnt =0;
        if(str.substring(0,2).equals("hi")){
            cnt++;
            return cnt + countHi(str.substring(2));
        }
        return cnt + countHi(str.substring(1));
    }
    //count all hi in string but ignore the hi which have x before them
    public static int countHi2(String str) {
        if(str.length()<=1){return 0;}
        int cnt=0;
        if(str.substring(0, 2).equals("hi")){
            cnt++;
            return cnt + countHi2(str.substring(1));
        }
        if(str.charAt(0) == 'x' && str.charAt(1)=='h'){
                return cnt + countHi2(str.substring(2));
            }
       else{
              return cnt + countHi2(str.substring(1));
            }
    }
}
