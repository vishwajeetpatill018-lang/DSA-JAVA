/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // Using ArrayList 
        // But Space : o(n);
        
        ArrayList<Integer> ans = new ArrayList();
        Node temp = head;
        while(temp != null){
            ans.add(temp.data);
            temp = temp.next;
        }
        // Check using 2 Pointer
        
        int n = ans.size();
        int i =0;
        int j = n-1;
        
        while(i<j){
            if(!ans.get(i).equals(ans.get(j))){
                return false;
                
            }
            i++;
            j--;
        }
        return true;
    }
}