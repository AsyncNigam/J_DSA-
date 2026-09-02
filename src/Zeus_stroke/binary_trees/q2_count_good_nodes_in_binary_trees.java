package Zeus_stroke.binary_trees;

import Binary_Search_Tree.TreeNode;

public class q2_count_good_nodes_in_binary_trees {

    class Solution {
        int[] arr;
        public int goodNodes(TreeNode root) {
            if(root==null)return 0;
            arr=new int[]{0};
            good(root,root.val);
            return arr[0];
        }

        void good(TreeNode root, int max){
            if(root==null)return ;
            if(root.val>=max)arr[0]++;
            max=Math.max(root.val,max);
            good(root.left,max);
            good(root.right,max);
        }

    }

// more suitable writing
//    class Solution {
//
//
//    public int goodNodes(TreeNode root) {
//        return dfs(root, root.val);
//    }
//
//    private int dfs(TreeNode node, int maxSoFar) {
//        if (node == null) return 0;
//
//        // 1. Am I a good node? (1 if yes, 0 if no)
//        int amIGood = (node.val >= maxSoFar) ? 1 : 0;
//
//        // 2. Update path max for my children
//        int newMax = Math.max(maxSoFar, node.val);
//
//        // 3. Ask my subtrees for THEIR totals
//        int leftSubtreeTotal  = dfs(node.left, newMax);
//        int rightSubtreeTotal = dfs(node.right, newMax);
//
//        // 4. Return my total contribution to my parent
//        return amIGood + leftSubtreeTotal + rightSubtreeTotal;
//    }
//}

}
