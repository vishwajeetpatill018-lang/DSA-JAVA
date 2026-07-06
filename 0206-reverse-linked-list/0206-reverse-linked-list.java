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
    public ListNode reverseList(ListNode head) {
        
        if(head == null)
         return null;
        ArrayList<ListNode> ans = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            // Add All nodes in ArrayList
            ans.add(temp);
            temp = temp.next;
        }
        // Reverse Traversal and make connection
        int n = ans.size();
        for(int i = n-1; i>=1; i-- ){
            ans.get(i).next = ans.get(i-1);
        }
        ans.get(0).next = null;
        return ans.get(n-1);

        // ListNode f = null;
        // ListNode curr = head;
        // ListNode prev = null;

        // while(curr != null){
        //     f = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = f;
        // }
        // return prev;

        // if(head == null || head.next == null){
        //     return head;
        // }
        // ListNode a = head.next;
        // ListNode newHead = head;

        
        // head.next = null;
        // newHead = reverseList(a);
        // a.next = head;
        // return newHead;
    }
}