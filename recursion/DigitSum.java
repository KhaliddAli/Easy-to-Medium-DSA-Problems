public class DigitSum {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(sumDigits(n));
    }
    public static int sumDigits(int n) {
        if(n==0) return 0;
        int num = n%10;
        return num + sumDigits(n/10);
    }
}
