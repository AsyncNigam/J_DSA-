package Binary_tree.video2;

public class diameter_of_binary_tree {

//    this is a bad approach , here we are doing recursion in recurion , which is not time efficient
//    The time complexity  is O(n^2)

//    class Solution {
//        public int diameterOfBinaryTree(TreeNode root) {
//            if(root==null)return 0;
//            int a=levels(root.left)+levels(root.right);
//            int b=diameterOfBinaryTree(root.left);
//            int c=diameterOfBinaryTree(root.right);
//            return Math.max(a,Math.max(b,c));
//        }
//
//        int levels(TreeNode root){
//            if(root==null)return 0;
//            return 1+Math.max(levels(root.left),levels(root.right));
//        }
//    }


//best approach  O(n)
//    like the approach of balanced binary tree
class Solution {

    int max;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        max=0;
        levels(root);
        return max;
    }

    int levels(TreeNode root){
        if(root==null)return 0;
        int leftLevels=levels(root.left);
        int rightLevels=levels(root.right);
        max=Math.max(max,leftLevels+rightLevels);
        return 1+Math.max(leftLevels,rightLevels);
    }
}
}
