import java.util.Scanner;

/**
 * bunnyears2
 */

public class bunnyears2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(bunnyEars2(n));
        sc.close();
    }
    public static int bunnyEars(int bunnies) {
        if(bunnies==0) return 0;
        return 2 + bunnyEars(bunnies-1);
    }
    public static int bunnyEars2(int bunnies) {
        if(bunnies == 0){
            return 0;
        }
        if(bunnies%2==0){
            return 3 + bunnyEars2(bunnies-1);
        }
        else{
            return 2 + bunnyEars2(bunnies -1);
        }
    }
}