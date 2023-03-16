/* Leetcode 142. Linked List Cycle II
 * Given the head of a linked list, return the node where the cycle begins.
 * If there is no cycle, return null.
 * There is a cycle in a linked list if there is some node
 * in the list that can be reached again by continuously following the next pointer.
 * Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed).
 * It is -1 if there is no cycle. Note that pos is not passed as a parameter.
 * Do not modify the linked list.
 */

import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution_142 {
    public static ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hset = new HashSet<>();

        while(head != null ){
            if (hset.contains(head)) {
                return head;
            }
            hset.add(head);
            head = head.next;
        }
        return null;
    }
    public static void main(String[] args) {
        
    }
}

