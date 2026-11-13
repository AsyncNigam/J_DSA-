package Zeus_stroke.q14_binary_trees;

import java.util.ArrayList;
import java.util.List;

public class q8_binary_tree_preorder_traversal {
    class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> ans=new ArrayList<>();
            preorder(root, ans);
            return ans;
        }
        void preorder(TreeNode root, List<Integer> list){
            if(root==null)return;
            list.add(root.val);
            preorder(root.left, list);
            preorder(root.right, list);
        }
    }
}
