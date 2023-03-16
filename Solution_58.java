/*Leetcode 58. Length of Last Word 
Given a string s consisting of words and spaces,
return the length of the last word in the string.

A word is a maximal substring
consisting of non-space characters only
*/

public class Solution_58 {
    public static int lengthOfLastWord(String s) {
        String str = s.trim();
        int count = 0;
        for (int i = str.length()-1; i > 0; i--) {
            if (str.charAt(i)==' ') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s1 = "hello world!  i am sahil";
        String st = s1.trim();
        int l = lengthOfLastWord(st);
        System.out.println(l);
        System.out.println(st.substring(st.length()-l,st.length()));
    }
}
