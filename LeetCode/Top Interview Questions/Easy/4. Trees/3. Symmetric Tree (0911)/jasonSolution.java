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
        if(preOrder1(root.left).equals(preOrder2(root.right)))
            return true;
        
        return false;
    }
    
    public String preOrder1(TreeNode root){
        if(root == null)
            return "n";
        
        return root.val + preOrder1(root.left) + preOrder1(root.right);
    }
    
    public String preOrder2(TreeNode root){
        if(root == null)
            return "n";
        
        return root.val + preOrder2(root.right) + preOrder2(root.left);
    }
}
