class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode b = slow.next;
        slow.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(b);

        return merge(left, right);
    }

    private ListNode merge(ListNode i, ListNode j) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (i != null && j != null) {
            if (i.val <= j.val) {
                temp.next = i;
                i = i.next;
            } else {
                temp.next = j;
                j = j.next;
            }
            temp = temp.next;
        }

        temp.next = (i != null) ? i : j;
        return dummy.next;
    }
}