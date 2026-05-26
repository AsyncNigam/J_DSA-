package Binary_Search_Tree;

import java.util.ArrayList;
import java.util.List;

public class q8_convert_bst_to_gst {
//  by inroder store in arraylist then from last index of arraylist update
    class Solution {
        public TreeNode convertBST(TreeNode root) {
            List<TreeNode> ans=new ArrayList<>();
            inOrder(root,ans);
            int sum=0;
            for(int i=ans.size()-1;i>=0;i--){
                sum += ans.get(i).val;
                ans.get(i).val = sum;
            }
            return root;
        }
        void inOrder(TreeNode root, List<TreeNode> ans){
            if(root==null)return;
            inOrder(root.left, ans);
            ans.add(root);
            inOrder(root.right, ans);
        }
    }
}
