package Experiment5;

import javax.swing.tree.TreeNode;

public class SortedToBST {
     public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums,0,nums.length-1);
    }
    public TreeNode sortedArrayToBST(int[] nums,int s,int e){
        if(s<=e){
            int mid=s+(e-s)/2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left=sortedArrayToBST(nums,s,mid-1);
            root.right=sortedArrayToBST(nums,mid+1,e);
            return root;
        }
        return null;
    }
}
