/*
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
    public Node reverseCircular(Node head) {
       
        Node t = head;
        while(t.next != head){
            t = t.next;
            
        }
        t.next = null;
        // Preserve Circularity After Reversing 
        Node newHead =  reverse(head);
        
        // Find tail (Orignals head)
        Node tail = newHead;
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next = newHead;
        
        return newHead;
        
    }
    public Node reverse(Node head){
        Node curr = head;
        Node fwd = null;
        Node prev = null;
        
        while(curr != null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
}