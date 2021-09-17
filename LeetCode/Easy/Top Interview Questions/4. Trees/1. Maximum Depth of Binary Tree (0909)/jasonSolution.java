/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        return checkDepth(root);
    }
    
    public int checkDepth(TreeNode node) {
        if(node == null)
            return 0;
        return Math.max(checkDepth(node.left), checkDepth(node.right))+1;
    }
}

