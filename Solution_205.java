/* Leetcode 205. Isomorphic Strings
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character
 * while preserving the order of characters. No two characters may map to the same character,
 * but a character may map to itself.
 */

import java.util.HashMap;

public class Solution_205 {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hp = new HashMap<>();
        boolean b = true;
        for (int i = 0; i < s.length(); i++) {
            if (hp.containsKey(s.charAt(i))) {
                if (hp.get(s.charAt(i)) != t.charAt(i)) {
                    b = false;
                }
            }else {
                hp.put(s.charAt(i), t.charAt(i));
            }
        }
        return b;
    }
    public static void main(String[] args) {
        String a = "badc", b = "baba";
        System.out.println(isIsomorphic(a, b));
    }
}
