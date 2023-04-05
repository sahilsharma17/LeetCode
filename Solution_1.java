/* Leetcode 1. Two Sum
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */

public class Solution_1 {
    public static int[] twoSum(int[] nums, int target){
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if (nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,4};
        int[] ans = twoSum(arr, 6);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
