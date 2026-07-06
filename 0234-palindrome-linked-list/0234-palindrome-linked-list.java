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
    public boolean isPalindrome(ListNode head) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            ans.add(temp.val);
            temp = temp.next;
        }
        int n = ans.size();
        int i =0;
        int j = n-1;
        while(i<j){
            // int a = ans.get(i);
            // int b = ans.get(j);
            // if(a!=b)
            if(!ans.get(i).equals(ans.get(j)))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}