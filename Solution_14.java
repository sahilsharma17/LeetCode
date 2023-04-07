/* Leetcode 14. Longest Common Prefix
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 */

public class Solution_14 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 ) return "";
        String prefix = strs[0];
        for (int i=1; i<strs.length; i++){
            while (strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] str = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }
}
