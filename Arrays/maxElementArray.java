public class maxElementArray {
    public static void main(String[] args) {
        int a[] ={3, 2, 5, 7, 1, 9, 1, 6, 8} ;
        System.out.println(MaxElement(a , 0));
        System.out.println(solution.FirstOccurance(a, 0, 5));
        System.out.println(solution.LastOccurance(a, 0, 1));

    }
    public static int MaxElement(int a[] , int i) {
        if(i==a.length-1)
        return a[i];
        // int sAns = MaxElement(a, i+1);
        // int m = Math.max(a[i] , sAns);
        int m = a[i] > MaxElement(a, i+1) ? a[i]:MaxElement(a,i+1) ;
        return m ;
    }
}
class solution {
    public static int FirstOccurance(int a[] , int i , int t) {
        if(i==a.length){
            return -1;
        }
        if(a[i] == t){
            return i;
        }
        else{
            return FirstOccurance(a, i+1, t) ;
        }
    }
    public static int LastOccurance(int a[] , int i , int t) {
        if(i==a.length){
            return -1;
        }
        int l = a.length-1 - i;
        if(a[l] == t){
            return l;
        }
        else{
            return LastOccurance(a, i+1, t);
        }
    }
}
