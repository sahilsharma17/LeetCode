/* Leetcode 409. Longest Palindrome
 * Given a string s which consists of lowercase or uppercase letters,
 * return the length of the longest palindrome that can be built with those letters.
 * Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
 */

public class Solution_409 {
    public static int longestPalindrome(String s) {
        int[] char_counts = new int[128];
        for (char c : s.toCharArray()) {
            char_counts[c]++;
        }
        int res = 0;
        for (Integer char_count : char_counts) {
            res += char_count/2*2;
            if ((res%2 == 0 && char_count%2 == 1)) {
                res +=1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }
}
