package Leetcode_75;

import Binary_Search_Tree.TreeNode;

//At any node, you have two choices:
//
//Continue the ZigZag: Move in the opposite direction of your previous step, incrementing steps + 1.
//
//Start a New ZigZag: Move in the same direction as your previous step, resetting the count to 1 (treating the current node as the new starting point).

//The second option, starting with zigzag, is because we are going zigzag, right? After a specific right movement we can't go right. We should go left to continue the zigzag. Instead of wasting that right we should give it a new chance and create a new path that may be a new zigzag. That's why instead of wasting it, we are giving it a new chance, creating a new next path for that specific next track, and continuing our zigzag.
public class q22_longest_zigzag_path_in_a_binary_tree {
    class Solution {
        int maxLen = 0;

        public int longestZigZag(TreeNode root) {
            if (root == null) return 0;

            // Start exploring both directions from the root
            // true = came from right (so go left next), false = came from left (so go right next)
            dfs(root.left, true, 1);
            dfs(root.right, false, 1);

            return maxLen;
        }

        private void dfs(TreeNode node, boolean goRight, int steps) {
            if (node == null) return;

            // Update the global maximum path length found so far
            maxLen = Math.max(maxLen, steps);

            if (goRight) {
                // Valid zigzag move: go right and increment steps
                dfs(node.right, false, steps + 1);
                // Reset path: go left starting fresh from this node
                dfs(node.left, true, 1);
            } else {
                // Valid zigzag move: go left and increment steps
                dfs(node.left, true, steps + 1);
                // Reset path: go right starting fresh from this node
                dfs(node.right, false, 1);
            }
        }
    }
}
