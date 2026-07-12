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
    Node deleteNode(Node head, int key) {
        if(head == null){
            return null;
        }
        if(head.next == head && head.data == key){
            
            return null;
        }
        Node t = head;
        while(t.next!= head){
            t = t.next;
        }
        // t.next = null;
        if(head.data == key){
            head = head.next ;
            t.next = head;
            return head;
        }
        Node temp = head;
        Node k  = head.next;
        while(k != head){
        if(k.data ==  key){
            temp.next = k.next;
            break;
        }
        else{
            temp = k;
            k = k.next;
                
            }
        }
        t.next = head;
        return head;
    }
}