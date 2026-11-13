package Zeus_stroke.q14_binary_trees;

import java.util.ArrayList;
import java.util.List;

public class q9_binary_tree_postorder_traversal {
    class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> ans=new ArrayList<>();
            postorder(root, ans);
            return ans;
        }
        void postorder(TreeNode root, List<Integer> ans){
            if(root==null)return ;
            postorder(root.left, ans);
            postorder(root.right, ans);
            ans.add(root.val);
        }
    }
}
