/*
 * @lc app=leetcode.cn id=725 lang=java
 *
 * [725] 分隔链表
 */

// @lc code=start
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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode curr = head;
        int length = 0;
        while (curr != null) {
            length ++;
            curr = curr.next;
        }
        int subLen = length / k;
        ListNode[] ans = new ListNode[k];
        curr = head;
        int remainLen = length;
        for (int i = 0; i < k; i++) {
            if (curr == null) {
                break;
            }
            ans[i] = curr;
            int count = subLen;
            if ((subLen * (k - i)) < remainLen) {
                count ++;
            }
            remainLen -= count;
            while (count > 1) {
                count --;
                curr = curr.next;
            }
            ListNode tail = curr;
            curr = curr.next;
            tail.next = null;
        }
        return ans;
    }
}
// @lc code=end

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
