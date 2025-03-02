package Experiment5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> levelcurr = new ArrayList<>(level);
            for(int i =0;i<level;i++){
                TreeNode current=queue.poll();
                if(current!=null){
                    queue.offer(current.left);
                    queue.offer(current.right);
                    levelcurr.add(current.val);
                }
                else{
                    levelcurr.add(101);
                }
            }
            list.add(levelcurr);
        }
        int size=list.size();
        for(int i =0;i<size;i++){
            List<Integer> level = list.get(i);
            for(int j=0;j<level.size()/2;j++){
                if(level.get(j)!=level.get(level.size()-j-1)){
                    return false;
                }
            }
        }
        return true;
    }
}
