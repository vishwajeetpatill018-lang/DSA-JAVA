/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int d)
    {
        data = d;
        left = right = null;
    }
}*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        
        if (root == null) return ans;
        q.add(root);
        int level = 0;
        
        while(q.size() >0){
            ArrayList<Integer> currentLevel = new ArrayList<>();
            
            int size = q.size();
            
            for(int i = 0; i<size; i++){
                Node front = q.remove();
                currentLevel.add(front.data);
                
            if(front.left != null){
                q.add(front.left);
            }
            if(front.right != null){
                q.add(front.right);
            }
                
        }
        
        if(level % 2 == 1){
            Collections.reverse(currentLevel);
        }
        ans.addAll(currentLevel);
        level++;
            
        }
        return ans;
    }
}