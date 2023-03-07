/*
 * Next Greater Element
Given an array arr of size n of non-zero positive integers,
the task is to find the next greater element
for each element of the array in order of their appearance in the array.

Next greater element of an element in the array is the nearest element on the right which is greater than the current element.

If there does not exist next greater of current element, then next greater element for current element is -1. For example, next greater of the last element is always -1.
 */
import java.util.*;
public class NextGreaterEle {
    public static void main(String[] args) {
        long arr[] = {3,2,5,1,4,8,6};
        System.out.println(nextLargerElement(arr, arr.length));
    }
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        //Write code here and print output
		long[] ans = new long[n];
		Stack<Integer> stck = new Stack<>();
		for(int i=0 ; i<n ; i++){
			while(stck.size()>0 && arr[stck.peek()] < arr[i]){
				ans[stck.peek()] = arr[i];
				stck.pop();
			}
			stck.push(i);
		}
		while(stck.size() > 0){
			ans[stck.peek()] = -1;
			stck.pop();
		}
		return ans;
    } 
}
