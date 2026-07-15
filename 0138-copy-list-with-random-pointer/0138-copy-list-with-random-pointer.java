/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node deepCopy(Node head1){
        Node temp1 = head1;
        Node head2 = new Node(-1);
        Node temp2 = head2;

        while(temp1 != null)
        {
            Node t = new Node(temp1.val);
            temp2.next = t;
            temp1 = temp1.next;
            temp2 = temp2.next;
            
        }   
        return head2.next;  // since head2 is at -1
    }
    public void merge(Node head1, Node head2){
        Node dummy  = new Node(-1);
        Node t1 = head1;
        Node t2 = head2;
        Node t = dummy;

        while(t2 != null){
            t.next = t1;
            t1 = t1.next;
            t = t.next;

            t.next = t2;
            t2 = t2.next;
            t = t.next;
        }
    }
    public void randomConnections(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;

        while(temp2 != null){

            if(temp1.random == null){
                temp2.random = null;
            
            }
            else{
                temp2.random = temp1.random.next;
            }
             temp1 = temp1.next.next;
             if(temp2.next != null) temp2 = temp2.next.next;
             else temp2 = null;
        }
    }
    public void separateBoth(Node head1){
        Node dummy1 = new Node(-1);
        Node t1 = dummy1;
        Node dummy2 = new Node(-1);
        Node t2 = dummy2;
        Node t = head1; // t is traversing on Combined list

        while(t != null){
            t1.next = t;
            t = t.next;
            t1 = t1.next;

            if(t== null) break;

            t2.next = t;
            t = t.next;
            t2 = t2.next;
        }
        t1.next = null;
    }

    public Node copyRandomList(Node head) {

        if(head == null) return null;
        // Steps to Solve this problem :
        //1 = Make deepCopy of orignal Linked list using dummy Node w/o considering random
        // 2 = Merge both orignal and deepCopy lists using 3 Nodes alternatively
        // 3 = Assigning random pointer accordingly 
        // 4 = Separate both orignal and deepCopy list and return deepcopys head (head2)

        Node head2 = deepCopy(head);
        merge(head, head2); 
        randomConnections(head , head2);
        separateBoth(head);

        return head2;
    }
}