/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if( head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;

        while( fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode b = slow.next;
        slow.next = null;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode i = sortList(head);
        ListNode j = sortList(b);
        while(i != null && j != null){
            if( i.val <= j.val){
                temp.next = i;
                i = i.next;
            } else{ // i.val > j.val
            temp.next = j;
            j = j.next;

            }
            temp = temp.next;
        }

        if( i != null) temp.next = i;
        if( j != null) temp.next = j;
         return dummy.next;
    }
}