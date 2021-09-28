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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        findOrder(root, list, 1);
        return list;
    }
    
    public void findOrder(TreeNode root, List<List<Integer>> list, int level){
        if(root == null)
            return ;
        if(list.size() >= level)
            list.get(level-1).add(root.val);
        
        else {
            List<Integer> tempList = new ArrayList<Integer>();
            tempList.add(root.val);
            list.add(tempList);
        }
        findOrder(root.left, list, level + 1);
        findOrder(root.right, list, level + 1);
    }
}
