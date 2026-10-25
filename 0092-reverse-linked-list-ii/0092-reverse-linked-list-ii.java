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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev_stop = dummy;
        ListNode curr = head;
        for(int k=1; k<left; k++){
            prev_stop = prev_stop.next;
            curr = curr.next;
        }
        ListNode after_right = curr;
        ListNode prev = null;
        int i = right - left + 1;
        for(int j=0; j<i; j++){
            ListNode newy = curr.next;
            curr.next = prev;
            prev = curr;
            curr = newy;
        }
        after_right.next = curr;
        prev_stop.next = prev;

        return dummy.next;
    }
}