package Binary_tree.video1;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Binary_tree_inOrder_traversal {
//    https://leetcode.com/problems/binary-tree-inorder-traversal/?envType=problem-list-v2&envId=binary-tree&

        class Solution {
            List<Integer> ans = new ArrayList();

            public List<Integer> inorderTraversal(TreeNode root) {
                display(root);
                return ans;
            }

            void display(TreeNode root) {
                if (root == null) return;
                display(root.left);
                ans.add(root.val);
                display(root.right);
            }
        }

//        by iterative approach
//
//class Solution {
//
//
//    public List<Integer> inorderTraversal(TreeNode root) {
//
//        List<Integer> ans=new ArrayList();
//        Stack<TreeNode> st=new Stack<>();
//        TreeNode curr=root;
//        while(st.size()>0 || curr!=null){
//            if(curr!=null){
//                if(curr.left!=null){
//                    st.push(curr);
//                    curr=curr.left;
//
//                }
//                else{
//                    ans.add(curr.val);
//                    curr=curr.right;
//
//                }
//            }
//            else{
//                TreeNode top=st.pop();
//                ans.add(top.val);
//                curr=top.right;
//            }
//        }
//
//        return ans;
//    }
//}
    }

