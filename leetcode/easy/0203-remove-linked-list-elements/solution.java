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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null ){
            return head;
        }
        ListNode dummy = new ListNode(-2);
        dummy.next = head;
        ListNode t1 = dummy;
       
        while(t1.next != null ){
           if(t1.next.val == val){
            t1.next = t1.next.next;
           } else{
             t1 = t1.next;
           }
          
           
        }
        return dummy.next;
        
    }
}