public class Array6 {
    public static void main(String[] args) {
        int arr[] = {1,2,4,6,4,7,6};
        System.out.println(array6(arr , 0));
    }
    public static boolean array6(int[] nums, int index) {
        if(index == nums.length){
            return false;
        }
        boolean flag = false;
        if(nums[index] == 6){
            flag = true;
        }
        if(flag == false){
            flag = array6(nums,index+1);
        }
        return flag;
    }
}
