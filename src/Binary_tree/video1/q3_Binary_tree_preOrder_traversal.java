package Binary_tree.video1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


//https://leetcode.com/problems/binary-tree-preorder-traversal/

public class q3_Binary_tree_preOrder_traversal {
//    class Solution {
//        public List<Integer> preorderTraversal(TreeNode root) {
//            List<Integer> ans=new ArrayList<>();
//            helper(root,ans);
//            return ans;
//
//        }
//        void helper(TreeNode root,List<Integer> ans){
//            if(root==null)return;
//            ans.add(root.val);
//            helper(root.left,ans);
//
//            helper(root.right,ans);
//
//        }
//
//
//    }

//    by iterative approach
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if (root == null) return ans;
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode temp=st.pop();
            ans.add(temp.val);
            if(temp.right!=null)st.push(temp.right);
            if(temp.left!=null) st.push(temp.left);
        }
        return ans;
    }
}
}
