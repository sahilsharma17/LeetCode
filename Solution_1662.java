/* Leetcode 1662. Check If Two String Arrays are Equivalent
 * Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
 * A string is represented by an array if the array elements concatenated in order forms the string.
 */

import java.util.Arrays;

public class Solution_1662{
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 = Arrays.toString(word1);
        String w2 = Arrays.toString(word2);

        char[] ws1 = w1.toCharArray();
        char[] ws2 = w2.toCharArray();


        boolean b=true;
        for(int i=0; i< word1.length; i++){
            if(ws1[i]!=ws2[i]){
                b = false;
                break;
            }else{
                b = true;
            }
        }
        return b;
    
    }

    public static void main(String[] args) {
        String[] a = new String[]{"a","b","c","ed"};
        String[] b = new String[]{"a","b","ce","d"};
        System.out.println(arrayStringsAreEqual(a, b));

    }
}