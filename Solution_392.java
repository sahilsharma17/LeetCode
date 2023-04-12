/* Leecode 392. Is Subsequence 
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
 * of the characters without disturbing the relative positions of the remaining characters.
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
*/

public class Solution_392 {
    public static boolean isSubsequence(String s, String t) {
        boolean b = true;
        for (int i = 0; i < s.length(); i++) {
            int j = 0;
            while (j < t.length()) {
                if (s.charAt(i) != t.charAt(j)) {
                    j++;
                    b = false;
                }
            }
        }
        return b;
    }
    public static void main(String[] args) {
        String a = "abc", b = "adbhc";
        System.out.println(isSubsequence(a, b));
    }
}
