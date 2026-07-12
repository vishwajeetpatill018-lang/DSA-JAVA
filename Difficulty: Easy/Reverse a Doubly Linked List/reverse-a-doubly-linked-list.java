/* Structure of doubly linked list node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
    
       if(head.next == null){
           return head;
       }
        Node prev = null;
        Node fwd = null;
        Node curr = head;
        
        while(curr != null){
            fwd = curr.next;
            curr.next = prev;
            curr.prev = fwd;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
}