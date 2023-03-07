import java.util.*;
public class prac {
    public static void main(String[] args) {
        //1 4 3 2 5
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0 ; i<n ; i++){
            a[i] = sc.nextInt();
        }
        leader(a);
        sc.close();
    }
    public static void leader(int a[])
    {
        int n = a.length;
        ArrayList<Integer> list = new ArrayList<>();
        
        int leader = a[n-1];
        //adding the default leader value
        list.add(leader);
        for(int i=n-2 ; i>=0 ; i--){
            //checking if any value is greater than leader
            if(a[i] > leader){
                list.add(a[i]);
                //changing leader value
                leader = a[i];
            }
        }
        System.out.println(list);
    }
}
