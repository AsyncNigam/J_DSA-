package Binary_tree.video2;

import java.util.ArrayList;
import java.util.List;


public class q1_binary_tree_paths {
    class Solution {
        List<String> list=new ArrayList<>();
        public List<String> binaryTreePaths(TreeNode root) {
            if(root!=null){
                findPaths(root,"");
            }
            return list;
        }
        void findPaths(TreeNode root,String s){
            s+=root.val;
            if(root.left==null && root.right==null)list.add(s);
            else{
                if(root.left!=null)findPaths(root.left,s+"->");
                if(root.right!=null)findPaths(root.right,s+"->");
            }
        }
    }
}
