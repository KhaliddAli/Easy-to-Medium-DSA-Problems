import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.nextLine();
        int n = Integer.parseInt(m);
        while(n>0){
        String s = sc.nextLine();
        String a[] = s.split(" ") ;
        for(int i=a.length-1 ; i>=0 ; i--)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        n--;
    }
        sc.close();
    // int a = sc.nextInt();
    // String b ="";
    // while(sc.hasNext())
    // {
    //     b = b+sc.next();
    // }
    // System.out.println(b);
    
    }
}
