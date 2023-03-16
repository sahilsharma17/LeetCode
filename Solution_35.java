/*Leetcode 35. Search Insert Position
Given a sorted array of distinct integers and a target value,
return the index if the target is found.
If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity. 
 */

 public class Solution_35 {
    public static int searchInsert(int[] nums, int target) {
        int low=0,high=nums.length-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if (nums[mid]==target){ return mid;}
            if (nums[mid]<target) { low = mid+1;}
            if (nums[mid]>target) { high = mid-1;}
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,5,9};
        System.out.println(searchInsert(arr, 2));
    }
}
