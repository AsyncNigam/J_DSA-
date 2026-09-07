package Zeus_stroke.binary_trees;

import java.util.ArrayList;
import java.util.List;

 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class q3_inOrder_traversal {

    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> ans=new ArrayList<>();
            inOrder(root,ans);
            return ans;
        }
        void inOrder(TreeNode root, List<Integer> ans){
            if(root==null)return ;
            inOrder(root.left,ans);
            ans.add(root.val);
            inOrder(root.right,ans);
        }
    }
}
