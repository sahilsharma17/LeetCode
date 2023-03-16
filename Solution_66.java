/*Leetcode 66. Plus One
 * You are given a large integer represented as an integer array digits,
 * where each digits[i] is the ith digit of the integer.
 * The digits are ordered from most significant to least significant in left-to-right order.
 * The large integer does not contain any leading 0's.
 * Increment the large integer by one and return the resulting array of digits.
 */

public class Solution_66 {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i=n-1; i>0; i--) {
            if (digits[i]<9) {
                digits[i]++;
                return digits;
            }else{
                digits[i]=0;
            }
        }
        int[] new_num = new int[n+1];
        new_num[0] = 1;
        return new_num;
        
    }
    public static void main(String[] args) {
        //int[] arr = new int[]{1,2,3,4};
        int[] arr2 = new int[]{9,9,9,9,9};
        int[] b = plusOne(arr2);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
