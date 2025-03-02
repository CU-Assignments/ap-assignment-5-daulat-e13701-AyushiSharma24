package Experiment5;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class ZigZagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        boolean reverse = false;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> currLevel = new ArrayList<>(level);
            for(int i =0;i<level;i++){
                if(!reverse){
                    TreeNode current=queue.pollFirst();
                     currLevel.add(current.val);
                    if(current.left!=null){
                        queue.addLast(current.left);
                    }
                    if(current.right!=null){
                      
                        queue.addLast(current.right);
                    }
                   
                }
                else{
                    TreeNode current=queue.pollLast();
                    currLevel.add(current.val);
                    if(current.right!=null){
                        queue.addFirst(current.right);
                    }
                    if(current.left!=null){
                        queue.addFirst(current.left);
                    }
                }
                  
                
            }
            reverse = !reverse;
            list.add(currLevel);
        }
        return list;
    }
}
