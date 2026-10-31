# Sort List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `head` of a linked list, return  *the list after sorting it in  **ascending order***.

 

 **Example 1:** 

```
Input: head = [4,2,1,3]
Output: [1,2,3,4]

```

 **Example 2:** 

```
Input: head = [-1,5,3,4,0]
Output: [-1,0,3,4,5]

```

 **Example 3:** 

```
Input: head = []
Output: []

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [0, 5 * 104].
- -105 <= Node.val <= 105

 

 **Follow up:**  Can you sort the linked list in `O(n logn)` time and `O(1)` memory (i.e. constant space)?

## Solution

**Language:** Java  
**Runtime:** 9 ms (beats 95.14%)  
**Memory:** 58.8 MB (beats 94.00%)  
**Submitted:** 2026-10-31T10:45:25.377Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/sort-list/)