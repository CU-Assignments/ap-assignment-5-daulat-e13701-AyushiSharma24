package Experiment5;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Inorder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return inorderTraversal(root,list);
    }
    public List<Integer> inorderTraversal(TreeNode node,List<Integer> list){
        if(node==null){
            return list;
        }
        inorderTraversal(node.left,list);
        list.add(node.val);
        inorderTraversal(node.right,list);
        return list;
    }
}
