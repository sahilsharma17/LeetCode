/* Leetcode 26. Remove Duplicates from Sorted Array
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that
 * each unique element appears only once. The relative order of the elements should be kept the same.
 * Then return the number of unique elements in nums.
 * Consider the number of unique elements of nums be k, to get accepted, you need to do the following things:
 * 
 * Change the array nums such that the first k elements of nums contain the unique elements in the
 * order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 */

public class Solution_26 {
    public static int removeDuplicates(int[] nums) {
        int j=1;
        for (int i=0; i<nums.length-1; i++){
            if (nums[i]!=nums[i+1]){
                nums[j]=nums[i+1];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,2,3,4,4,5,6,6};
        int l = removeDuplicates(arr);
        for (int i=0; i<=l-1; i++){
            System.out.println(arr[i]);
        }
        
    }
}
