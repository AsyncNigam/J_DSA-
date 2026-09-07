package Binary_tree.video1;

import java.util.ArrayList;
import java.util.List;

public class q4_binary_tree_postorder {
    class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> ans=new ArrayList<>();
            helper(root,ans);
            return ans;
        }
        void helper(TreeNode root,List<Integer> ans){
            if(root==null)return;

            helper(root.left,ans);
            helper(root.right,ans);
            ans.add(root.val);
        }
    }

//    for iterative way

//    class Solution {
//    public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer> ans=new ArrayList<>();
//        if (root == null) return ans;
//        Stack<TreeNode> st=new Stack<>();
//        st.push(root);
//        while(!st.isEmpty()){
//            TreeNode temp=st.pop();
//            ans.add(temp.val);
//
//            if(temp.left!=null) st.push(temp.left);
//            if(temp.right!=null)st.push(temp.right);
//        }
//       Collections.reverse(ans);
//       return ans;
//        }
//}
}
