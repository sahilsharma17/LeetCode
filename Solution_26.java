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
