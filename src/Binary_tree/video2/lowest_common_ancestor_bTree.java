package Binary_tree.video2;

public class lowest_common_ancestor_bTree {

//    this approach is of O(n^2) ,
//    class Solution {
//        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//            if(root==null)return null;
//            if(root==p || root==q)return root;
//
//            if((ispresent(root.right,p) && ispresent(root.left,q)) || (ispresent(root.left,p) && ispresent(root.right,q)))return root;
//            TreeNode left=lowestCommonAncestor(root.left,p,q);
//            TreeNode right=lowestCommonAncestor(root.right,p,q);
//            return (left!=null)?left:right;
//        }
//        boolean ispresent(TreeNode root,TreeNode p){
//            if(root==null)return false;
//            if(root.val==p.val)return true;
//            return ispresent(root.left,p) || ispresent(root.right,p);
//        }
//    }


//    for the optimized approach like , in balanced binary tree we have done ,

    class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)return null;
        if(root==q || root==p) return root;
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(left!=null  && right!=null) return root;  // this means between p and q one is in left and one is in right.
        if(left!=null) return left; // both in left
        if(right!=null) return right; //both in right
        return null; // this will not happen because in constrain it is given that p, q must be present in the tree and are not the same , but for safety

    }
}


}
