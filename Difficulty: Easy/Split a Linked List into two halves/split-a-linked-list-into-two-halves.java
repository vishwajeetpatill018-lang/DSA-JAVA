/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public Pair<Node, Node> splitList(Node head) {
     
     // Stpes :
     //1=> Traverse till t.next!= head (travel till tail)
     // 2) Find left middle of the ll
     // 3) Make connections by slow.next = head and t.next = b;
     
     Node t = head;
     
     while(t.next != head){
         t = t.next;
     }
     // Now t is at tail
     t.next = null;
     
     
     // Find left middle of ll
     
     
     Node fast = head;
     Node slow = head;
     while(fast.next != null && fast.next.next != null){
        fast = fast.next.next;
        slow = slow.next;
    }
    // Now slow is at left middle of ll
    
    Node b = slow.next;
    slow.next = head;
    t.next = b;
    return new Pair<>(head,b) ;
    
}}