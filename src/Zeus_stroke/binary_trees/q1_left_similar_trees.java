package Zeus_stroke.binary_trees;

import Binary_Search_Tree.TreeNode;

import java.util.ArrayList;

public class q1_left_similar_trees {
    class Solution {
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            ArrayList<Integer> arr1=new ArrayList<>();
            count(root1,arr1);

            ArrayList<Integer> arr2=new ArrayList<>();
            count(root2,arr2);

            return arr1.equals(arr2);
        }
        void count(TreeNode root,ArrayList<Integer> arr){
            if(root==null)return;

            if(root.left==null && root.right==null) arr.add(root.val);

            count(root.left,arr);
            count(root.right, arr);
        }


    }
}
