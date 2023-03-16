public class Solution_724 {
    public static int pivotIndex(int[] nums) {
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        int left_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i!=0) {
                left_sum += nums[i-1];
            }
            if (total - left_sum - nums[i] == left_sum) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = new int[]{1,7,3,6,5,6};
        System.out.println(pivotIndex(a));
    }
}
