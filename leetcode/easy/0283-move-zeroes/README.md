# Move Zeroes

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

 **Note**  that you must do this in-place without making a copy of the array.

 

 **Example 1:** 

```
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

```

 **Example 2:** 

```
Input: nums = [0]
Output: [0]

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -231 <= nums[i] <= 231 - 1

 

 **Follow up:**  Could you minimize the total number of operations done?

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 92.90%)  
**Memory:** 47.3 MB (beats 89.36%)  
**Submitted:** 2026-11-02T18:51:06.646Z  

```java
class Solution {
    public void moveZeroes(int[] num) {
      int len = num.length;
      int i = 0;
      int j = 0;
      while(i < len){
        if( num[i] != 0){
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
            j++;
        }
        i++;
            

            
        }
      
      
      
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/move-zeroes/)