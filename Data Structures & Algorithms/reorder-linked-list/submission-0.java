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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode slow = head;
        ListNode fast = head;
        ListNode cur = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rev = slow.next;
        slow.next = null;
        rev = reverse(rev);
        while( rev != null){
            ListNode firstNext = cur.next;
            ListNode secondNext = rev.next;
            cur.next = rev;
            rev.next = firstNext;
            cur = firstNext;
            rev = secondNext;
        }
    }
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode next = null;
        ListNode cur = head;
        while(cur != null){
            next = cur.next;
            cur.next =prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
