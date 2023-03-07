public class countX {
    public static void main(String[] args) {
        String s = "abdxjiugdxhxxhxyxko" ;
        System.out.println(countx(s));
    }
    public static int countx(String str) {
        if(str.length()==0) return 0;
        int cnt =0;
        if(str.charAt(0) =='x') cnt++;
        cnt+= countx(str.substring(1));
        return cnt;
      }
}
