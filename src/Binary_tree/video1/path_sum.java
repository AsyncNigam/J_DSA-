package Binary_tree.video1;

public class path_sum {
    class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum){

            if(root==null)return false; //if we have reached leaf return false , because we have to find the path from root to leaf node if root has no leaf i.e. root is leaf return false although if equals to targetSum

//          here we are not going to root ==null , we are chacking a level above

            if(root.left==null && root.right==null){
                if(targetSum==root.val)return true;
                return false;
            }
            return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
        }
    }
}
