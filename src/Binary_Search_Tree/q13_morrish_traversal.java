package Binary_Search_Tree;

import java.util.ArrayList;
import java.util.List;


//inorder traversal by morris traversal

public class q13_morrish_traversal {
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> ans = new ArrayList<>();
            TreeNode curr = root;

            while (curr != null) {
                if (curr.left != null) {
                    TreeNode pred = curr.left;

                    // Fix: Clear, single-line condition with explicit braces
                    while (pred.right != null && pred.right != curr) {
                        pred = pred.right;
                    }

                    if (pred.right == null) {
                        pred.right = curr; // Establish temporary link
                        curr = curr.left;
                    } else {
                        pred.right = null; // Revert changes to the tree
                        ans.add(curr.val);
                        curr = curr.right;
                    }
                } else {
                    ans.add(curr.val);
                    curr = curr.right;
                }
            }
            return ans;
        }
    }
}
