package Binary_Search_Tree;

public class q2_validate_bst {

//    this will give error because we are just checking the current nodes left or right but we should check for each node of lst with root and with ech node of rst with root

//    class Solution {
//        public boolean isValidBST(TreeNode root) {
//            if(root==null)return true;
//            if(root.left!=null && root.left.val>=root.val)return false;
//            if(root.right!=null && root.right.val<=root.val)return false;
//            return isValidBST(root.left)&& isValidBST(root.right);
//        }
//    }
}
