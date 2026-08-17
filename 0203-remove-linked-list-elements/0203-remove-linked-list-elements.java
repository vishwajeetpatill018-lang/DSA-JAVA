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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ListNode dummy = new ListNode(-1);
        ListNode t1 = dummy;
        t1.next = head;

        
        
        while(temp != null){
            
            if(temp.val == val){
                
                t1.next = temp.next;
                temp = temp.next;
                
            }
            else{
                temp =  temp.next;
                t1 = t1.next;
            }
        }
        return dummy.next;
    }
}