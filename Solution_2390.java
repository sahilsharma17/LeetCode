/* Leetcode 2390. Removing Stars From a String
 * You are given a string s, which contains stars *.
 * In one operation, you can:
 *  Choose a star in s.
 * Remove the closest non-star character to its left, as well as remove the star itself.
 * Return the string after all stars have been removed.
 * 
 * Note:
 * The input will be generated such that the operation is always possible.
 * It can be shown that the resulting string will always be unique.
 */

public class Solution_2390 {
    public static String removeStars(String s) {
        s=s.trim();

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
              sb.append(s.charAt(i));
            }
            else{
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "leet**cod*e";
        System.out.println(removeStars(str));
    }
}
