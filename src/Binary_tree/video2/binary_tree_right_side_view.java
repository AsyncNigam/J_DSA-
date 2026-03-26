package Binary_tree.video2;

import java.util.*;

public class binary_tree_right_side_view {

//     this is approach 3 , if level of any root> arraylist size then add other wise update
    class Solution {
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> ans=new ArrayList<Integer>();
            view(root,0,ans);
            return ans;
        }
        void view(TreeNode root,int level,List<Integer> ans){
            if(root==null)return ;
            if(level>=ans.size())ans.add(root.val);
            else ans.set(level,root.val);
            view(root.left,level+1,ans);
            view(root.right,level+1,ans);
        }
    }
}

//for left view gfg just reversion the manner of recursion in view function

//class Solution {
//    public ArrayList<Integer> leftView(Node root) {
//        // code here
//        ArrayList<Integer> ans=new ArrayList<Integer>();
//        view(root,0,ans);
//        return ans;
//    }
//    static void view(Node root,int level,ArrayList<Integer> ans){
//        if(root==null)return ;
//        if(level>=ans.size())ans.add(root.data);
//        else ans.set(level,root.data);
//        view(root.right,level+1,ans);
//        view(root.left,level+1,ans);
//
//    }
//}
