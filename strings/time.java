import java.util.*;

public class time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        int len = time.length();
        int hrs = Integer.parseInt(time.substring(0, 2));
        //System.out.println(hrs);
        if(time.charAt(len-2) == 'A')
        {
            if(hrs == 12)
            {
                System.out.println("00" + time.substring(2, len-2));
            }
            else
            {
                System.out.println(time.substring(0, len-2));
            }
        }
        else
        {
            if(hrs == 12)
            {
                System.out.println(time.substring(0, len-2));
            }
            else
            {
                hrs += 12;
                System.out.println(hrs+ time.substring(2, len-2));
            }
        }

        sc.close();
    }
}