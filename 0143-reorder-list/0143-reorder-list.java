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

 // Find Middle of Linked List
 // Use middle to reverse second half of linked list
 // merge boththe halves alternatively (Zigzag pattern)
class Solution {
    public void reorderList(ListNode head) {
        if(head.next == null) return;

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Now middle is at slow
        // Reverse 2nd half of LL

        ListNode prev = null;
        ListNode fwd = null;
        ListNode curr = slow.next;

        // Connect tail of 1st half to null
        slow.next = null;

        while(curr != null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        // Now we have head of reversed ll at prev
        // Merge both the halves

        ListNode first = head;
        ListNode second = prev;
        while( second != null){
            ListNode next1 = first.next;
            ListNode next2 = second.next;

            first.next = second;
            second.next = next1;

            first = next1;
            second = next2;
        }
    }
}