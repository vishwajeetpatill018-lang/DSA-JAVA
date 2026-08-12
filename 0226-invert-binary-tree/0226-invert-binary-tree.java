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
    // HERE  , BOTH PREORDER AND POSTORDER WORKS (INORDER ONLY  WORKS WHEN SAME PARAMETER IS PAASED IN BOTH THE CALLS)
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        // For PreOrder
        // TreeNode temp = root.left;
        // root.left = root.right;
        // root.right = temp;

        // invertTree(root.left);
        // invertTree(root.right);

        // For postOrder
        // TreeNode temp = root.left;
        // root.left = root.right;
        // root.right = temp;


        // Solved usinf Inorder
        invertTree(root.left);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);

        return root;
    }
}