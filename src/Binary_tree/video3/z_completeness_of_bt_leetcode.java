package Binary_tree.video3;
//https://leetcode.com/problems/check-completeness-of-a-binary-tree/
public class z_completeness_of_bt_leetcode {
    class Solution {
        public boolean isCompleteTree(TreeNode root) {
            int size=size(root);
            return isCBT(root,1,size);
        }
        int size(TreeNode root){
            if(root==null)return 0;
            return 1+size(root.left)+size(root.right);
        }
        boolean isCBT(TreeNode root, int idx,int size){
            if(root==null)return true;
            if(idx>size)return false;
            return isCBT(root.left, 2*idx, size) && isCBT(root.right, 2*idx+1, size);

        }
    }
}
