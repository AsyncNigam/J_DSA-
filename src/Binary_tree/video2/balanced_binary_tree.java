package Binary_tree.video2;

public class balanced_binary_tree {
//    basic approach with recursion in recursion
//    balanced b tree means maximum level difference between any 2 sub trees either 0 or 1 not more than that.
//    so we are going to each node then finding the levels , if level difference>1 then return false , if reached to null then true, then going for the subtrees;
//    class Solution {
//        public boolean isBalanced(TreeNode root) {
//            if(root==null)return true;
//            int leftLevels=levels(root.left);
//            int rightLevels=levels(root.right);
//            if(Math.abs(leftLevels-rightLevels)>1)return false;
//            return isBalanced(root.left) && isBalanced(root.right);
//
//        }
//
//        int levels(TreeNode root){
//            if(root==null)return 0;
//            return 1+Math.max(levels(root.left),levels(root.right));
//        }
//    }




//on the above approach we are doing recursion in recursion we do not need that . we are going for every subtree levels multiple times , not needed.


//    in this approach we are going to once for level of each and in the level function if we saw difference>1 store false in flag ,
    class Solution {

        boolean flag;

        public boolean isBalanced(TreeNode root) {
            if(root==null)return true;
            flag=true;
            levels(root);
            return flag;
        }

        int levels(TreeNode root){
            if(root==null)return 0;
            int leftLevels=levels(root.left);
            int rightLevels=levels(root.right);
            if(Math.abs(leftLevels-rightLevels)>1) flag=false; // this line only added to levels function as compare to previous approach

            return 1+Math.max(leftLevels,rightLevels);
        }
    }
}
