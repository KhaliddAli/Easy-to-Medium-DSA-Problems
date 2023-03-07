public class ParenBit {
    public static void main(String[] args) {
        String s = "abc(ghi)def";
        System.out.println(parenBit(s));
    }
    //given a string eg : "abc(ghi)def" return (ghi) recursively ;
    public static String parenBit(String str) {
        if(str.length() == 0){
            return "";
        }
        if(str.charAt(0)=='('){
            String out = "(";
            int i =1;
            while(str.charAt(i) != ')'){
                out+= str.charAt(i)+"";
                i++;
            }
            return out+")";
        }
        return parenBit(str.substring(1));

    }
    
}
