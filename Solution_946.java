/* 946. Validate Stack Sequences
 * Given two integer arrays pushed and popped each with distinct values,
 * return true if this could have been the result of a sequence of push and
 * pop operations on an initially empty stack, or false otherwise.
 */

public class Solution_946 {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        int i = 0, j = 0;
        for (int num : pushed) {
            pushed[i++] = num;
            while (i > 0 && pushed[i - 1] == popped[j]) {
                i--;
                j++;
            }
        }
        return i == 0;
    }
    public static void main(String[] args) {
        int[] push = new int[]{1,2,3,4,5};
        int[] pop = new int[]{4,5,3,2,1};
        System.out.println(validateStackSequences(push, pop));

    }    
}
