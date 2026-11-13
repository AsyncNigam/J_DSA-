package Zeus_stroke.q14_binary_trees;

import java.util.*;

public class q10_binary_tree_level_order_traversal {
    class Solution {
        class Pair{
            TreeNode root;
            int level;
            Pair(TreeNode root, int level){
                this.root=root;
                this.level=level;
            }
        }
        int levels(TreeNode root){
            if(root==null)return 0;
            return 1+Math.max(levels(root.left),levels(root.right));
        }

        public List<List<Integer>> levelOrder(TreeNode root) {
            if (root == null) return new ArrayList<>();
            List<List<Integer>> ans=new ArrayList<>();
            for(int i=0;i<levels(root); i++){
                ans.add(new ArrayList<>());
            }
            Queue<Pair> q=new LinkedList<>();
            q.add(new Pair(root,0));
            while(!q.isEmpty()){
                Pair top=q.remove();
                ans.get(top.level).add(top.root.val);
                if(top.root.left!=null)q.add(new Pair(top.root.left, top.level+1));
                if(top.root.right!=null)q.add(new Pair(top.root.right, top.level+1));
            }
            return ans;
        }
    }
}
