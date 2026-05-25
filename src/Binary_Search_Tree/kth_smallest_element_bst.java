package Binary_Search_Tree;

import java.util.ArrayList;
import java.util.List;

public class kth_smallest_element_bst {

// because inorder in binary search tree is sorted in increasing order

//    class Solution {
//        public int kthSmallest(TreeNode root, int k) {
//            List<Integer> ans = new ArrayList();
//            inOrder(root, ans);
//            return ans.get(k - 1);
//        }
//
//        void inOrder(TreeNode root, List<Integer> ans) {
//            if (root == null)
//                return;
//            inOrder(root.left, ans);
//            ans.add(root.val);
//            inOrder(root.right, ans);
//        }
//    }

//    without any extra arraylist

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {
        int k2;
        int ans;
        public int kthSmallest(TreeNode root, int k) {
            k2=k;
            ans=-1;
            inOrder(root);
            return ans;
        }

        void inOrder(TreeNode root) {
            if (root == null)
                return;
            inOrder(root.left);
            k2--;
            if(k2==0)ans = root.val;
            inOrder(root.right);
        }
    }

}
