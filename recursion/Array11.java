public class Array11 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 11, 6, 7, 11, 6, 11, 4, 9, 8, 11, 12,11};
        System.out.println(array11(arr,0));
    }
    public static int array11(int[] nums, int index) {
        if(index == nums.length){
            return 0;
        }
        int cnt =0;
        if(nums[index] == 11){
            cnt++;
        }
        cnt+= array11(nums , index+1);
        return cnt;
    }
    
}
