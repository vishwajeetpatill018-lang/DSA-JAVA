/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    
     public Node addTwoLists(Node head1, Node head2) {
        
        
        // Reverse both the linked list
        head1 = reverse(head1);
        head2 = reverse(head2);
        
        // Both LL are now reversed
        
        Node dummy = new Node(-1);
        Node tail = dummy;
        
        int carry = 0;
        
        // Add digits
        
        while(head1 != null || head2!= null || carry!=0){
            int sum = carry;
            
            if(head1 != null){
                sum += head1.data;
                head1  = head1.next;
            }
             if(head2 != null){
                sum += head2.data;
                head2  = head2.next;
            }
            
            carry = sum/10;
            int digit = sum%10;
            
            tail.next = new Node(digit);
            tail = tail.next;
        }
            // Reverse Answer
            Node ans = reverse(dummy.next);
            
            //Remove leading Zeros
            
            while(ans!= null && ans.data == 0 && ans.next != null){
                ans = ans.next;
            }
             
        
        return ans;
       
    }
    public Node reverse(Node head){
        Node prev = null;
        Node fwd = null; 
        Node curr = head;
        
        while(curr!= null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
}