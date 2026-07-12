/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
       if(x == 1){
           return head.next;
       }
        Node t = head;
        for(int i =1; i< x-1 ; i++){
            t = t.next;
        }
        // Now t is at Node before x;
        t.next = t.next.next;
        return head;
    }
}