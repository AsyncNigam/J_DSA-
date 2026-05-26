package Binary_Search_Tree;

//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

public class lowest_common_ancestor_BST {

//    go from root if root lie between p and q return , Lowest common ancestor
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//            if(root==null)return null; // in constraint given number of nodes  greater than or equal 2
            if(root.val< p.val && root.val<q.val)return lowestCommonAncestor(root.right,p,q);
            if(root.val>p.val && root.val>q.val)return lowestCommonAncestor(root.left,p,q);

//  it also handles cases for root when only 2nodes present and given that one node can be ancestor of itself
            return root; //root lie between p and q return

        }
    }
}
