/* Leetcode 258. Add Digits
 * Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
 */

public class Solution_258 {
    public static int addDigits(int num) {
        if(num == 0) return 0;
        else if(num % 9 == 0) return 9;
        else return num % 9;
    }
    public static void main(String[] args) {
        System.out.println(addDigits(98));
    }
}
