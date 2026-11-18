# Remove Linked List Elements

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `head` of a linked list and an integer `val`, remove all the nodes of the linked list that has `Node.val == val`, and return  *the new head*.

 

 **Example 1:** 

```
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]

```

 **Example 2:** 

```
Input: head = [], val = 1
Output: []

```

 **Example 3:** 

```
Input: head = [7,7,7,7], val = 7
Output: []

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [0, 104].
- 1 <= Node.val <= 50
- 0 <= val <= 50

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 97.92%)  
**Memory:** 46.3 MB (beats 98.56%)  
**Submitted:** 2026-11-18T17:49:59.195Z  

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
```

---

[View on LeetCode](https://leetcode.com/problems/remove-linked-list-elements/)