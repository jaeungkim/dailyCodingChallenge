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
    public TreeNode sortedArrayToBST(int[] nums) {
        int index = nums.length/2;
        TreeNode root = new TreeNode(nums[index]);
        addMiddle(root, nums, 0, index-1);
        addMiddle(root, nums, index+1, nums.length-1);
        return root;
    }
    
    public void addMiddle(TreeNode root, int[] nums, int left, int right){
        if(left > right)
            return ;
        else {
            int index = (left+right)/2;
            addNode(root, nums[index]);
            addMiddle(root, nums, left, index-1);
            addMiddle(root, nums, index+1, right);
        }
            
            
    }
    public void addNode(TreeNode root, int val){
        if (root == null)
            return ;
        if (root.val < val){
            if(root.right != null)
                addNode(root.right, val);
            else 
                root.right = new TreeNode(val);
        }
        
        if(root.val > val){
            if(root.left != null)
                addNode(root.left, val);
            else 
                root.left = new TreeNode(val);
        }
    }
}
