package Binary_Search_Tree;

//https://leetcode.com/problems/search-in-a-binary-search-tree/description/

// time complexity is O(levels) = O(logn) in best case
//in worst case time complexity is O(n) worst case is like single lined bst
public class q3_search_in_bst {
    class Solution {
        public TreeNode searchBST(TreeNode root, int val) {
            if(root==null)return null;
            if(root.val==val)return root;
            else if(root.val>val)return searchBST(root.left,val); // search in left subtree
            else return searchBST(root.right, val); // search in right subtree
        }
    }
}
