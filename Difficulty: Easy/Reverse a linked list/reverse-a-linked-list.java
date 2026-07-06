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
    Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        Node f = null;
        
        
        while(curr != null){
            
            f = curr.next;
            curr.next = prev;
            prev = curr;
            curr = f;
            
        }
        return prev;
    }
}