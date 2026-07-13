/* Structure of a doubly link list node
class Node {
    int data;
    Node prev, next;
    Node(int x) {
        data = x;
        prev = null;
        next = null;
    }
}*/

class Solution {
    public int length(Node head){
        int len = 0;
        Node temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        return len;
    }
    public Node rotateDLL(Node head, int k) {
        if( head==null || k<=0 ) {
            return head;
        }
        int len = length(head);
        k%=len;
         if(k == 0) return head;
        
        Node curr = head;
        
        for(int i =1; i<k; i++){
            curr = curr.next;
        }
        Node newHead = curr.next;
        newHead.prev = null;
        curr.next = null;
        
        
        Node t = newHead;
        while(t.next != null){
            t = t.next;
        }
        t.next = head;
        t.prev = t;
        
        return newHead;
    }
}