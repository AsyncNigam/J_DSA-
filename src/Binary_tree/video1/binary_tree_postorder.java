package Binary_tree.video1;

import java.util.ArrayList;
import java.util.List;

public class binary_tree_postorder {
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
}
