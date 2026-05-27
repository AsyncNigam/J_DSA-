package Binary_Search_Tree;

//https://leetcode.com/problems/maximum-sum-bst-in-binary-tree/description/

public class q11_maximum_sum_bst_in_binary_tree {

//    this approach is from the triplet approach of validate bast

    class Quard {
        long max;
        long min;
        int sum;
        boolean isBst;

        //    we have taken long because in node value there can be integer value
        Quard(long max, long min,int sum, boolean isBst) {
            this.max = max;
            this.min = min;
            this.sum= sum;
            this.isBst = isBst;
        }
    }

    class Solution {
        int maxSum=0;

        public int maxSumBST(TreeNode root) {
            maxMin(root);
            return  maxSum;
        }

        Quard maxMin(TreeNode root) {
            if(root == null)
                return new Quard(Long.MIN_VALUE, Long.MAX_VALUE,0 , true);
            Quard lst = maxMin(root.left);
            Quard rst = maxMin(root.right);
            long max = Math.max(root.val, Math.max(lst.max, rst.max));
            long min = Math.min(root.val, Math.min(lst.min, rst.min));
            boolean isBst = lst.isBst && rst.isBst && lst.max < root.val && rst.min > root.val;
            int sum=(isBst) ? (root.val + lst.sum + rst.sum) : (lst.sum + rst.sum);
            if (isBst) {
                maxSum = Math.max(maxSum, sum);
            }
            return new Quard(max, min, sum, isBst);
        }
    }
}
