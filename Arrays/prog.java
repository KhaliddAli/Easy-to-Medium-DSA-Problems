import java.util.*;

public class prog {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int m = sc.nextInt();
                String a = ((double) n / (double) m) + "";
                if (a.charAt(2) == (char) (m + '0')) {
                        String s = a.substring(0, 2) + '(' + m + ")";
                        System.out.println(s);
                } else if (a.charAt(2) == '0' && a.length() == 3) {
                        System.out.println(a.charAt(0));
                } else {
                        System.out.println(a);
                }
                sc.close();
        }
}
