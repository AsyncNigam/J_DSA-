package Binary_Search_Tree;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/validate-binary-search-tree/description/

//just take the in order store in array if the array sorted then bst if not then not

public class q7_validate_bst {
    class Solution {
        public boolean isValidBST(TreeNode root) {
            List<Integer> ans=new ArrayList<>();
            inOrder(root,ans);
            for(int i=0;i<ans.size()-1;i++){
                if(ans.get(i)>=ans.get(i+1))return false;
            }
            return true;
        }
        void inOrder(TreeNode root, List<Integer> ans) {
            if (root == null)
                return;
            inOrder(root.left, ans);
            ans.add(root.val);
            inOrder(root.right, ans);
        }
    }
}
