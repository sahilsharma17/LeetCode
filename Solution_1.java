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
