/* Leetcode 20. Valid Parentheses
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid. An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 */

import java.util.Stack;

public class Solution_20 {
    public boolean isValid(String s) {

        if (s.length()%2 != 0) return false;

        Stack<Character> stk = new Stack<>();

        for (char c : s.toCharArray()){
            if (c=='(' || c=='{' || c=='[' ){
                stk.push(c);
            }else if(c==')' && !stk.isEmpty() && stk.peek()=='('){
                stk.pop();
            }else if(c=='}' && !stk.isEmpty() && stk.peek()=='{'){
                stk.pop();
            }else if(c==']' && !stk.isEmpty() && stk.peek()=='['){
                stk.pop();
            }else {
                return false;
            }
        }return stk.empty();
    }
}
