
/* Leetcode 2348. Number of Zero-Filled Subarrays
 * Given an integer array nums, return the number of subarrays filled with 0.
 * A subarray is a contiguous non-empty sequence of elements within an array.
 */

import java.util.List;

public class Solution_2348 {
    public static long zeroFilledSubarray(int[] nums) {
        long res = 0;
        for (int i=0,j=0; i<=nums.length-1; i++){
            if (nums[i] != 0){
                j = i + 1;
            }else{  
                res += i - j + 1;
            }
        }
    return res;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,0,0,2,0,0,4};
        System.out.println(zeroFilledSubarray(arr));
    }
}
