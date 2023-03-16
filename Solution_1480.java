/*Leetcode 1480. Running Sum of 1d Array
 * Given an array nums. We define a running sum of an array as
 * runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 */

public class Solution_1480 {
    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int j = 0;
        for (int i=0; i<nums.length; i++ ) {
            if (i==0 && j==0) {
                ans[j] = nums[i];
                j++;
            } else {
                ans[j] = nums[i]+ans[j-1];
                j++;
            }
            
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,1,1,1,1};
        for (int i = 0; i < a.length; i++) {
            System.out.println(runningSum(a)[i]);
        }
    }
}
