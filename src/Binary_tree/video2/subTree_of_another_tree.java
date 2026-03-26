package Binary_tree.video2;

public class subTree_of_another_tree {
    class Solution {
        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            if(root==null)return false;
            if(isSame(root,subRoot))return true;  //for each iteration we are checking that if subtree or not , if subtree return true
            return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);

        }

        boolean isSame(TreeNode a, TreeNode b){
            if(a==null && b==null)return true;
            if(a==null || b==null)return false;
            if(a.val!=b.val)return false; // here as shallow copies we checking by value not directly , have different memory objects



            return isSame(a.left,b.left) && isSame(a.right,b.right);
        }
    }
}
