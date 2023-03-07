public class Pow {
    public static void main(String[] args) {
        System.out.println(powerN(2, 3));
    }
    public static int powerN(int base, int n) {
        if(n==0)
        return 1;
        int sAns = powerN(base,n-1);
        return base * sAns;
    }
}
