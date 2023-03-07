public class Count8 {
    public static void main(String[] args) {
        int n = 88888;
        System.out.println(count8(n));
    }
    //count 8 in a number but if a 8 if followed by another 8 it will be counted twice
    public static int count8(int n) {
        if(n==0){
            return 0;
        }
        int cnt =0;
        if(n%10 == 8){
            //checking if it has a 8 before it if yes adding 1 to ans ;
            if((n%100)/10 ==8){
                cnt++;
            }
            //adding 1 to ans;
            cnt++;
        }
        
        return cnt + count8(n/10);
    }
    //count 11 in a string 
    public static int count11(String str) {
        if(str.length()<=1){
            return 0;
        }
        int count = 0;
        if(str.substring(0,2).equals("11")){
            count++;
            return count + count11(str.substring(2));
        }
        else{
            return count + count11(str.substring(1));
        }
    }
}
