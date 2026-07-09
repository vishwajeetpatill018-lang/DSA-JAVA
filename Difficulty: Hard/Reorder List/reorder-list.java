/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public void reorderList(Node head) {
        // Find Middle of ll
        // REverse 2nd half
        // Join both halves
        
        if(head == null && head.next == null){
            return;
        }
        
        Node fast = head;
        Node slow = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
        }
        // Now slow is at middle of LL
        // Use sloe to reverse 2nd half of linked list
        
        
        Node prev = null;
        Node curr = slow.next;
        Node fwd = null;
        
        // break lists
        slow.next = null;
        
        while(curr != null){
            
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
            
        }
        // Now prev is the newHead of  Second half linkedlist
        // Link this 2nd half ll with first half linked list
        
        
        
         Node first = head;
         Node second = prev;
        
        while(second != null){
            Node next1 = first.next;
            Node next2 = second.next;
            
            first.next = second;
            second.next = next1;
            
            first = next1;
            second = next2;
            

        }
        
       
    }
    
    
}