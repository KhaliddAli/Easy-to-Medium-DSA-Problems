/*
Given a string,
return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))". 
Suggestion: check the first and last chars, and then recur on what's inside them.


nestParen("(())") → true
nestParen("((()))") → true
nestParen("(((x))") → false
 */
public class NextParen {
    public static void main(String[] args) {
        String s = "((()))";
        System.out.println(nestParen(s));
    }
    public static boolean nestParen(String str) {
        Boolean flag = true;
        if(str.length()==0){
            return flag;
        }
        if(str.charAt(0)=='(' && str.charAt(str.length()-1)==')'){
            flag = nestParen(str.substring(1, str.length()-1));
        }
        if(str.charAt(0)=='(' && str.charAt(str.length()-1)!=')'){
            return false;
        }
        if(str.charAt(0)!='('){
            flag = nestParen(str.substring(1));
        }
        return flag;
    }
}
