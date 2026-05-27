package Binary_Search_Tree;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/validate-binary-search-tree/description/

//just take the in order store in array if the array sorted then bst if not then not

public class q7_validate_bst {
//    class Solution {
//        public boolean isValidBST(TreeNode root) {
//            List<Integer> ans=new ArrayList<>();
//            inOrder(root,ans);
//            for(int i=0;i<ans.size()-1;i++){
//                if(ans.get(i)>=ans.get(i+1))return false;
//            }
//            return true;
//        }
//        void inOrder(TreeNode root, List<Integer> ans) {
//            if (root == null)
//                return;
//            inOrder(root.left, ans);
//            ans.add(root.val);
//            inOrder(root.right, ans);
//        }
//    }



//    this will give error because we are just checking the current nodes left or right but we should check for each node of lst with root and with ech node of rst with root

//    class Solution {
//        public boolean isValidBST(TreeNode root) {
//            if(root==null)return true;
//            if(root.left!=null && root.left.val>=root.val)return false;
//            if(root.right!=null && root.right.val<=root.val)return false;
//            return isValidBST(root.left)&& isValidBST(root.right);
//        }
//    }


//    we can validate using Pair class
class Pair {
    long max;
    long min;

    Pair(long max, long min) {
        this.max = max;
        this.min = min;
    }
}

    class Solution {
        boolean flag;

        public boolean isValidBST(TreeNode root) {
            flag = true;
            maxMin(root);
            return flag;
        }

        Pair maxMin(TreeNode root) {
            if (root == null)
                return new Pair(Long.MIN_VALUE, Long.MAX_VALUE);
            Pair lst = maxMin(root.left);
            Pair rst = maxMin(root.right);
            long max = Math.max(root.val, Math.max(lst.max, rst.max));
            long min = Math.min(root.val, Math.min(lst.min, rst.min));
            if (lst.max >= root.val || rst.min <= root.val)  //this will check that minimum coming from lst and maximum coming from rst if not then it is not the bst
                flag = false;
            return new Pair(max, min);
        }
    }
}
