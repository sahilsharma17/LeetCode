

public class Solution_21 {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(0);
        ListNode curr = temp;
        while (list1 != null && list2 != null ){
            if (list1.val <= list2.val){
                curr.next = list1;
                list1 = list1.next;
            }else{ 
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        curr.next = list1!=null ? list1 : list2;
        return temp.next;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(5);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(5);
        System.out.println(mergeTwoLists(l4, mergeTwoLists(l1, mergeTwoLists(l3, mergeTwoLists(l2, l5)))).val);
        
    }
}
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
