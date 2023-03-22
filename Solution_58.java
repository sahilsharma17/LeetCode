/*Leetcode 58. Length of Last Word 
* Given a string s consisting of words and spaces,
* return the length of the last word in the string.
* A word is a maximal substring
* consisting of non-space characters only
*/

public class Solution_58 {
    public static int lengthOfLastWord(String s) {
        int count = 0;
        String st = s.trim();
        if (st.length() == 1 ) count = 1;
        else{
            for(int i=st.length()-1; i>=0; i--){
                if( st.charAt(i)!=' ') {count++;}
                else break;
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
