package Binary_Search_Tree;

public class q14_delete_nodes_in_bst {

//    without any child node , I mean we are deleting the leaf node
//    class Solution {
//        public TreeNode deleteNode(TreeNode root, int key) {
//            if(root==null)return null;
//            if(root.val==key)return null;
//            if(root.val<key){
//                root.right=deleteNode(root.right,key);
//            }
//            if(root.val> key)root.left=deleteNode(root.left, key);
//            return root;
//        }
//    }

//    for only 1 child either the node we are going to delete have left or right not both

//    class Solution {
//        public TreeNode deleteNode(TreeNode root, int key) {
//            if(root==null)return null;
//            if(root.val==key){
//                if(root.left!=null)return root.left;
//                if(root.right!=null)return root.right;
//                return null; // if both are null
//            }
//            if(root.val<key){
//                root.right=deleteNode(root.right,key);
//            }
//            if(root.val> key)root.left=deleteNode(root.left, key);
//            return root;
//        }
//    }

//    delete node for who has both child subtrees O(n)

class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return null;
        if (root.val < key) {
            root.right = deleteNode(root.right, key);
        }
        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        }
        if (root.val == key) {
            //case 1 if leaf node
            if(root.left==null && root.right==null)return null;

            // case 2 if one child present
            if (root.left == null) return root.right;
            if (root.right == null)
                return root.left;

                // case 3 if both child present
                // here we have to return the predecessor or successor after connecting with the pred or successer to root left or right subtree
            else {
                TreeNode pred= root.left;
                while(pred.right!=null){
                    pred=pred.right;
                }
                root.left=deleteNode(root.left,pred.val); // this will break the loop of predecessor to root left right agian and again loop will be broken
                pred.left=root.left;
                pred.right=root.right;
                return pred;

            }

        }
        return root;
    }
}
}
