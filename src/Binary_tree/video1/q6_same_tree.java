package Binary_tree.video1;

public class q6_same_tree {
    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if(p==null && q==null)return true;
            if(p == null || q == null)return false; // here we are meaning to say    if((p==null && q!=null) || (p!=null && q==null))return false; but as in top we have mentioned the double condition so it does not needed
            if(p.val!=q.val)return false;

            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

        }
    }
}
