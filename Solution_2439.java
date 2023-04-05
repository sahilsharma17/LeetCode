/* Leetcode 2439. Minimize Maximum of Array
 * You are given a 0-indexed array nums comprising of n non-negative integers.
 * In one operation, you must:
 * Choose an integer i such that 1 <= i < n and nums[i] > 0.
 * Decrease nums[i] by 1.
 * Increase nums[i - 1] by 1.
 * Return the minimum possible value of the maximum integer of nums after performing any number of operations.
 */

public class Solution_2439 {
    public static int minimizeArrayValue(int[] nums) {
        long res=0, sum=0;
        for (int i=0; i<nums.length; i++){
            sum += nums[i];
            res = Math.max(res, (sum + i) / (i + 1));
        }
        return (int)res;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,7,1,6};
        int[] arr2 = new int[]{10,1};
        System.out.println(minimizeArrayValue(arr2));
    }
}
