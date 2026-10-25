/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int sz1 = 0, sz2 = 0;
        while(temp1 != null){
            sz1++;
            temp1 = temp1.next;
        }
        while(temp2 != null){
            sz2++;
            temp2 = temp2.next;
        }
        int total = sz1+sz2;
        int count = 0;
        temp1 = headA;
        temp2 = headB;
        while(temp1 != temp2){
            count++;
            if(count == total){
                return null;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;

            if(temp1 == null){
                temp1 = headB;
            }
            if(temp2 == null){
                temp2 = headA;
            }
        }
        return temp1;
    }
}