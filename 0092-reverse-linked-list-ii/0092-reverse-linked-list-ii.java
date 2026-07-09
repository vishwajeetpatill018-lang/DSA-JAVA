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
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        t.next = head;

        // Break LL into 3 parts
        // Reverse middle part
        // Connect 

        for(int i = 0; i<left-1; i++){
            t = t.next;
        }
        // Now t is at tail1
        ListNode tail1 = t;
        ListNode head2 = tail1.next;

        t = dummy;

        for(int i =0; i<right; i++){
            t = t.next;
        }
        // Now t is  at tail2
        ListNode tail2 = t;
        ListNode head3 = tail2.next;
        tail2.next = null;
        tail1.next = null;

        // Now reverse from left to right
        ListNode curr = head2;
        ListNode prev = null;
        ListNode  fwd = null;

        while(curr !=  null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        // prev is head of reversed ll
        // Connect prev to tail1;
        // Connect tail2  to head3

        tail1.next = tail2;
        head2.next = head3;

        return dummy.next;


    }
}