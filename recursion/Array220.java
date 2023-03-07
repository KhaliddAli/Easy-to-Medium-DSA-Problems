/**
 * Array220
 */
public class Array220 {
    public static void main(String[] args) {
        int arr[] = {1,2,20};
        System.out.println(array220(arr, 0));
    }    
    //compute recursively to check if a value is followed by 10 times the value in array;
    public static boolean array220(int[] nums, int index) {
        if(index>=nums.length-1){
            return false;
        }
        boolean flag = false;
        if(nums[index]*10 == (nums[index+1])){
            flag = true;
        }
        if(flag == false){
            flag = array220(nums, index+1);
        }
        return flag;
    }
}