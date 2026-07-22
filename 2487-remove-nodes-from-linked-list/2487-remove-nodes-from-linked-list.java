/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode t = head;
        Stack<ListNode> st = new Stack<>();

           while(t != null){
                while(st.size() > 0 && st.peek().val < t.val){
                    st.pop();
                }
                    st.push(t);

                    t = t.next;
                
           }
            while(st.size() > 0){
                ListNode top = st.pop();
                    top.next = t;
                    t = top;
                }
                return t;
        }
        
    }

