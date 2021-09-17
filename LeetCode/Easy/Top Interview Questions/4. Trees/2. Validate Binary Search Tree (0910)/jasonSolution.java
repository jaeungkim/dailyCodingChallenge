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
    int preVal = 0;
    boolean isFirst = true;
    public boolean isValidBST(TreeNode root) {
        return check(root);
    }
    public boolean check(TreeNode node){
        if(node == null)
            return true;
        else if(!check(node.left))
            return false;
        else if(isFirst){
            isFirst = false;
            preVal = node.val;
        }
        else if (node.val <= preVal)
            return false;
        
        preVal = node.val;
        return check(node.right);
    }
}
