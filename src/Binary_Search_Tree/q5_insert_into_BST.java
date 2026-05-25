package Binary_Search_Tree;

//https://leetcode.com/problems/insert-into-a-binary-search-tree/
public class q5_insert_into_BST {

//     by using void function
//    class Solution {
//        public TreeNode insertIntoBST(TreeNode root, int val) {
//            if(root==null)return new TreeNode(val);
//            helper(root, val);
//            return root;
//        }
//
//        void helper(TreeNode root, int val) {
//            if (root == null) return;
//            if (root.val < val){
//                if(root.right == null)root.right=new TreeNode(val);
//                else insertIntoBST(root.right, val);
//            }
//            else{ //root.val > val
//                if(root.left == null)root.left=new TreeNode(val);
//                else insertIntoBST(root.left,val);
//            }
//        }
//    }


//    without any extra function
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        // Base case: If we've reached a null spot, this is where the new node goes.
        if (root == null) {
            return new TreeNode(val);
        }

        // If the value is less, go attach and then update the left pointer.
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        }
        // If the value is greater, go right attach and then update the right pointer.
        else if (val > root.val) {
            root.right = insertIntoBST(root.right, val);
        }

        // Return the unchanged node pointer back up the call stack.
        return root;
    }
}
}
