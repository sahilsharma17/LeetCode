/* Leetcode 657. Robot Return to Origin
 * There is a robot starting at the position (0, 0), the origin,
 * on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0)
 * after it completes its moves.
 * You are given a string moves that represents the move sequence of the robot
 * where moves[i] represents its ith move. Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).
 * Return true if the robot returns to the origin after it finishes all of its moves, or false otherwise.
 * Note: The way that the robot is "facing" is irrelevant. 'R' will always make the robot move to the right once,
 * 'L' will always make it move left, etc. Also, assume that the magnitude of the robot's movement is the same for each move
 */

public class Solution_657 {
    public static boolean judgeCircle(String moves) {
        boolean b = false;
        int Ucount=0, Dcount=0, Rcount=0, Lcount=0;
        char[] move = moves.toCharArray();
        for(int i=0;i<move.length;i++){
            if (move[i]=='U'){ Ucount++;}
            else if (move[i]=='D'){ Dcount++;}
            else if (move[i]=='R'){ Rcount++;}
            else if (move[i]=='L'){ Lcount++;}
            else {b = false; break;}
        }
        if (Dcount==Ucount && Lcount==Rcount) {
            b = true;
        }
        return b;
    }
    public static void main(String[] args) {
        System.out.println(judgeCircle("LRUUDD"));
    }
}
