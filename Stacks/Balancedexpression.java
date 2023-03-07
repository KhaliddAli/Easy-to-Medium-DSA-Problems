import java.util.*;
/*
 * check weather all the opening brackets closes;
 * Balanced Expression
You are given a string exp representing an expression.
You are required to check if the expression is balanced
i.e. closing brackets and opening brackets match up well.

The string exp contains the characters '(', ')', '{', '}', '[', ']',
operators i.e. '-', '+', '*', '/' and lowercase english alphabets.
 */
public class Balancedexpression {
    public static void main(String[] args) {
        String str1 = "[(a+b)+{(c+d)*(e/f)}]";
        String str2 = "[(a+b)+{(c+d)*(e/f)]}";
        System.out.println(expBalanced(str1));
        System.out.println(expBalanced(str2));
    }
    public static boolean expBalanced(String str){
        // write code here
		Stack<Character> s = new Stack<>();
		int n = str.length();
		//iterating on the string;
		for(int i=0 ; i<n ; i++){
			//checking if the last pushed bracket matches the closing at i;
			if(s.size()>0 && s.peek() == '('){
				if(str.charAt(i)==')') s.pop();
			}
			if(s.size()>0 && s.peek() == '['){
				if(str.charAt(i)==']') s.pop();
			}
			if(s.size()>0 && s.peek() == '{'){
				if(str.charAt(i)=='}') s.pop();
			}
				/*
				if the opening doesn't matches,
				it means the char at i is not closing bracket;
			  */
			else{
				/*
				checking if the char at i is an opening bracket,
				if not skipping other characters;
				if it is an opening bracket pushing it in the stack;
				*/
				if(str.charAt(i) == '(') s.push(str.charAt(i));
				else if(str.charAt(i) == '[') s.push(str.charAt(i));
				else if(str.charAt(i) == '{') s.push(str.charAt(i));
			}
		}
		//after the loop is completed the size should be zero if the brackets are balanced;
		if(s.size() ==0){
			return true;
		}
		else return false;
    }
}