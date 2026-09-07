package Zeus_stroke.binary_trees;

public class q4_invert_binary_trees {
    class Solution {
        public TreeNode invertTree(TreeNode root) {
            if(root==null)return null;
            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
            invertTree(root.left);
            invertTree(root.right);
            return root;
        }
    }
}
