package Experiment5;

import javax.swing.tree.TreeNode;

public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root,null,null);
    }
    public boolean isValidBST(TreeNode node,Integer min,Integer max){
        if(node==null){
            return true;
        }
        if((min!=null&&node.val<=min)||(max!=null&&node.val>=max)){
            return false;
        }
        return isValidBST(node.left,min,node.val)&&isValidBST(node.right,node.val,max);
    }
}
