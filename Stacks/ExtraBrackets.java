import java.util.Stack;

/*
 * Extra Brackets
You are given a string exp representing an expression. 
Assume that the expression is balanced ,
i.e. the opening and closing brackets match with each other.
But, some pair of brackets maybe extra/needless.
You are required to find out if there are extra brackets or not.
 */
public class ExtraBrackets {
    public static void main(String[] args) {
        String s1 = "((a + b) + (c + d))";
        String s2 = "(a + b) + ((c + d))";
        System.out.println(extraBrackets(s1));
        System.out.println(extraBrackets(s2));
    }
    public static boolean extraBrackets(String exp) {
		//length of the exp
        int n = exp.length();
		//creating a stack
		Stack<Character> stck = new Stack<>();
		//iterating on all the characters in the expression
		for(int i=0;  i<n ;i++){
			//checking if the char at i is closing beacket or not
			//if it is not closing bracket adding it to the stack
			if(exp.charAt(i) != ')') stck.push(exp.charAt(i));
			//if it is closing bracket then moving in this box
			else{
				//if the top element in the stack is opening bracket which means the bracket is empty and return true
				if(stck.size()>0 && stck.peek() == '(') return true;
					//if top element in stack is not opening bracket poping the top element till we get opening bracket
				else{
					while(stck.size()>0 && stck.peek() != '(') stck.pop();
					//after poping all top elements poping the opeing bracket;
					stck.pop();
				}
			}
		}
		return false;
    }
}
