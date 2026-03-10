package Binary_tree.video1;

import java.util.ArrayList;
import java.util.List;


//https://leetcode.com/problems/binary-tree-preorder-traversal/

public class Binary_tree_preOrder_traversal {
    class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> ans=new ArrayList<>();
            helper(root,ans);
            return ans;

        }
        void helper(TreeNode root,List<Integer> ans){
            if(root==null)return;
            ans.add(root.val);
            helper(root.left,ans);

            helper(root.right,ans);

        }


    }
}
