import java.util.ArrayList;
import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // LL list = new LL();
        // while(sc.hasNextInt()){
        //     int n = sc.nextInt();
        //     list.addLast(n);
        // }
        // Node a = list.removeLast();
        // System.out.println(a.data);
        // list.Display(list.head);
        String s = sc.next();
        OldPhone(s);
        System.out.println(ss);
        sc.close();
    }
    static ArrayList<String> ss = new ArrayList<>();
    public static void OldPhone(String s) {
        String sol ;
        if(s.length()==1){
           sol =  Print(s.charAt(0)-'0');
           ss.add(sol);
           return;
        }
        sol = Print(s.charAt(0)-'0') ;
        ss.add(sol);

        OldPhone(s.substring(1));

    }
    public static String Print(int a){
        String arr[] = {".;" , "abc" , "def" , "ghi" , "jkl","mno","qrs","tu" , "vwx", "yz"};

        return arr[a];

    }
}
