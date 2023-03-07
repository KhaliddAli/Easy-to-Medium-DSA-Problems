/*
 * Balanced Brackets
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.

An input string is Balanced if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 */
import java.util.*;;
public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        balancedBrackets(s, s.length());
        sc.close();
    }
    public static void balancedBrackets(String s, int n) {
        // write code here
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n ;i++){
            if(st.size() >0 && st.peek() == '(' && s.charAt(i)==')') st.pop();
            if(st.size() >0 && st.peek() == '[' && s.charAt(i)==']') st.pop();
            if(st.size() >0 && st.peek() == '{' && s.charAt(i)=='}') st.pop();
            else{
                if(s.charAt(i) == '(') st.push(s.charAt(i));
				else if(s.charAt(i) == '[') st.push(s.charAt(i));
				else if(s.charAt(i) == '{') st.push(s.charAt(i));
            }
        }
        if(st.empty()){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
