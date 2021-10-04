public class jaeSolution {
        //find depth of a binary tree
        //if tree is empty return 0
        //else
        //get the max depth of left subtree recursively (call maxDepth) 
        //get the max depth of right subtree recursively
        //get the max of max depths of left and right subtrees and add 1 to it for the current node.
        //max_depth = max(max dept of left subtree, max depth of right subtree) + 1
        //return max_depth
        
        if(root == null)
            return 0;
        else {
            int lDepth = maxDepth(root.left);
            int rDepth = maxDepth(root.right);
            if(lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
}
