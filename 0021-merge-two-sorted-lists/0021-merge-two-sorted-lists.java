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
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(-1);
        // if(head1 == null && head2 == null ){
        //     return head1;
        // }
        ListNode t = dummy;
        ListNode a = head1;
        ListNode b = head2;
        while(a != null && b != null){
        if(a.val <= b.val){
            
            t.next = a;
            a = a.next;
            t = t.next;
        }
        else{
            
            
            t.next = b;
            b = b.next;
            t = t.next;
        }
        }
        if(a != null){
            t.next = a;
        }
        else{
            t.next = b;
        }
        
        return dummy.next;
    }
}