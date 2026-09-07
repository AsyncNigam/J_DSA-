package Binary_tree.video1;

public class q7_symmetric_tree {

//    my approach

//    class Solution {
//        public boolean isSymmetric(TreeNode root) {
//            TreeNode copy=copyTree(root);
//            return isSameTree(root,invertTree(copy));
//        }
//        public TreeNode copyTree(TreeNode root) {  //here we are creating copy because if we directly use is same function to invertion of rooot with root it automatically changes the root which will be always true so we have created copy
//            if (root == null) return null;
//            return new TreeNode(root.val, copyTree(root.left), copyTree(root.right));
//        }
//        public TreeNode invertTree(TreeNode root) {
//            if(root==null)return root;
//            TreeNode temp=root.left;
//            root.left=root.right;
//            root.right=temp;
//            invertTree(root.left);
//            invertTree(root.right);
//            return root;
//        }
//
//        public boolean isSameTree(TreeNode p, TreeNode q) {
//            if(p==null && q==null)return true;
//            if(p == null || q == null)return false;
//            if(p.val!=q.val)return false;
//
//            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
//
//        }
//    }


//    let's pass only the one subtree then check wth another subtree
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSameTree(root.left,invertTree(root.right));
    }

    public TreeNode invertTree(TreeNode root) {
        if(root==null)return root;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)return true;
        if(p == null || q == null)return false;
        if(p.val!=q.val)return false;

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

    }
}
}
