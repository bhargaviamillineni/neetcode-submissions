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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur = head;
        for(int i=0; i<k; i++){
            if(cur == null) return head;
            cur = cur.next;
        }
        ListNode prev = null;
        cur = head;
        for(int i=0; i<k; i++){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head.next = reverseKGroup(cur , k);
        return prev;
    }
}
