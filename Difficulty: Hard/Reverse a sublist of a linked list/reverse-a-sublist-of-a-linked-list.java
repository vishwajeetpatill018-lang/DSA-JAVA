/* Structure of a Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseBetween(int l, int r, Node head) {
     
        Node dummy = new Node(-1);
        Node t = dummy;
        dummy.next = head;
        
        
        
        for(int i =0; i<l-1; i++){
            t = t.next;
        }
        //t is at tail1 
        Node tail1 = t;
        Node head2 = tail1.next;
        t = dummy;
        
        for(int i =0; i<r; i++){
            t = t.next;
        }
        Node tail2 = t;
        Node head3 = tail2.next;
        //For Now , t is at tail2
        
        tail1.next = null;
        tail2.next = null;
        
        // Now reverse from l to r;
        
        Node prev = null;
        Node fwd = null;
        Node curr = head2;
        
        while(curr!= null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        // prev is at 
        tail1.next = prev;
        head2.next = head3;
        
        return dummy.next;
    }
    
}