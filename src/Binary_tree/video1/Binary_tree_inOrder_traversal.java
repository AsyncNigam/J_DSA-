package Binary_tree.video1;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Binary_tree_inOrder_traversal {
//    https://leetcode.com/problems/binary-tree-inorder-traversal/?envType=problem-list-v2&envId=binary-tree&

        class Solution {
            List<Integer> ans = new ArrayList();

            public List<Integer> inorderTraversal(TreeNode root) {
                display(root);
                return ans;
            }

            void display(TreeNode root) {
                if (root == null) return;
                display(root.left);
                ans.add(root.val);
                display(root.right);
            }
        }
    }

