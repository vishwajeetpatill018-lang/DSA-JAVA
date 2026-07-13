/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null){
            return head;
        }
        Node t = head;
        while(t != null){
           
            if(t.child != null){
                Node a = t;
                Node b = t.next;
                Node c = t.child;
                c = flatten(t.child);
                a.next = c;
                c.prev = a;
                t.child = null;

                
                // c.next = a;
                // a.prev = c;
               

                Node tail = c;
                while(tail.next != null){
                    tail  = tail.next;
                }

                tail.next = b;
                if(b != null) b.prev = tail;
                a = b;

            }
            else{
                t = t.next;
            }
        }
        return head;
    }
}