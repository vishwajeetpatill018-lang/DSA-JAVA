/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;

        mirror(root.left);
        return isIdentical(root.left , root.right);

    }
    void mirror(TreeNode root){
        if(root == null) return;

    TreeNode temp = root.left ;
    root.left = root.right;
    root.right = temp;

    mirror(root.left);
    mirror(root.right);

    }
    boolean isIdentical(TreeNode a , TreeNode b){
        if(a == null && b == null) return true;
        if(a == null || b == null) return false;

        if(a.val != b.val) return false;

        return isIdentical(a.left ,b.left) && isIdentical(a.right , b.right);
    }
}