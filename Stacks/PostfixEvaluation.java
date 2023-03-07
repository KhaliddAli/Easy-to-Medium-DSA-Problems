import java.util.*;
public class PostfixEvaluation {
    public static void main(String[] args) {
        String s = "823^/23*+51*-";
        Stack<Integer> st = new Stack<>();

        for(int i=0 ; i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                st.push(ch-'0');
            }
            else if(ch == '+'){
                int a = st.pop();
                int b = st.pop();
                st.push(b+a);
            }
            else if(ch == '^'){
                int a = st.pop();
                int b = st.pop();
                st.push((int)(Math.pow(b,a)));
            }
            else if(ch == '/'){
                int a = st.pop();
                int b = st.pop();
                st.push(b/a);
            }
            else if(ch == '*'){
                int a = st.pop();
                int b = st.pop();
                st.push(b*a);
            }
            else if(ch == '-'){
                int a = st.pop();
                int b = st.pop();
                st.push(b-a);
            }
        }
        System.out.println(st);
    }
}
