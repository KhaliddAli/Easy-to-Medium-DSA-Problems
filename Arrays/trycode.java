
import java.util.Scanner;

public class trycode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //System.out.println(Arrays.toString(arr));
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if(i==j){continue;}
                if (arr[i] == arr[j]) {
                    cnt++;
                }
            }
            if (cnt == k) {
                flag = true;
                System.out.println(arr[i]);
                break;
            }
        }
        if(flag == false)
        System.out.println(-1);
        sc.close();

    }
}
