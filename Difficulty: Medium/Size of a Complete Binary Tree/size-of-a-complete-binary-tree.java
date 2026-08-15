class Solution {

    public int countNodes(Node root) {
    
        int count = 0;
        
        if(root == null){
            return 0;
        }
        
        return 1+ countNodes(root.left) + countNodes(root.right);
        

    }
}