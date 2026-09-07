package Zeus_stroke.binary_trees;

import java.util.ArrayList;
import java.util.List;

public class q7_binary_tree_paths {
    class Solution {
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> s=new ArrayList<>();
            if(root==null)return s;
            helper(root,s,"");
            return s;

        }
        void helper(TreeNode root, List<String> list, String str ){
            str+=root.val;
            if(root.left==null && root.right==null)list.add(str);
            if(root.left!=null)helper(root.left,list,str+"->");
            if(root.right!=null)helper(root.right,list,str+"->");
        }
    }
}
