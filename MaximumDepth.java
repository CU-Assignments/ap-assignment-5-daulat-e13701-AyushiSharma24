package Experiment5;
import javax.swing.tree.TreeNode;

public class MaximumDepth{
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return helper(root,0);
    }
    public int helper(TreeNode node,int depth){
        if(node==null){
            return depth;
        }
        return Math.max(helper(node.left,depth+1),helper(node.right,depth+1));
    }

}