/*Leetcode 2444. Count Subarrays With Fixed Bounds 
You are given an integer array nums and two integers minK and maxK.

A fixed-bound subarray of nums is a subarray that satisfies the following conditions:

The minimum value in the subarray is equal to minK.
The maximum value in the subarray is equal to maxK.
Return the number of fixed-bound subarrays.

A subarray is a contiguous part of an array.
*/


public class Solution_2444 {
    public static long countSubarrays(int[] nums, int minK, int maxK) {
        long res = 0;
        int prev = -1, lastMin = -1, lastMax = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minK || nums[i] > maxK) {
                prev = lastMin = lastMax = i;
            } else {
                lastMin = nums[i] == minK ? i : lastMin;
                lastMax = nums[i] == maxK ? i : lastMax;
            }

            res += Math.max(0L, Math.min(lastMin, lastMax) - prev);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,2,7,5};
        int min=1, max=5;
        System.out.println(countSubarrays(arr, min, max));
    }
}
