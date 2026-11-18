package Leetcode_75;

import Binary_Search_Tree.TreeNode;

public class q21_path_summ_3 {
    class Solution {
        public int pathSum(TreeNode root, int targetSum) {
            if (root == null) return 0;

            // 1. Count paths starting from the current root
            // 2. Plus paths starting from the left subtree
            // 3. Plus paths starting from the right subtree
            return countPaths(root, targetSum)
                    + pathSum(root.left, targetSum)
                    + pathSum(root.right, targetSum);
        }

        private int countPaths(TreeNode root, long targetSum) { // here it is long to avoid integer overflow
            if (root == null) return 0;

            int count = 0;
            if (root.val == targetSum) {
                count++; // Found a valid path sum
            }

            // Continue downwards to find more paths passing through children
            count += countPaths(root.left, targetSum - root.val);
            count += countPaths(root.right, targetSum - root.val);

            return count;
        }
    }
}
