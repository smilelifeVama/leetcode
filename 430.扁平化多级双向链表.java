/*
 * @lc app=leetcode.cn id=430 lang=java
 *
 * [430] 扁平化多级双向链表
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
         Node curr = head;
         Node temp = null;
         while (curr != null) {
            if (curr.child == null) {
                curr = curr.next;
            } else {
                Node tmp = curr.next;
                Node chead = flatten(curr.child);
                curr.next = chead;
                chead.prev = curr;
                curr.child = null;
                while (curr.next != null) curr = curr.next;
                curr.next = tmp;
                if (tmp != null) tmp.prev = curr;
                curr = tmp;
            }
         }
         return head;
    }
}
// @lc code=end

class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};