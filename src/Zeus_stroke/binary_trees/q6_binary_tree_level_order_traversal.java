package Zeus_stroke.binary_trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class q6_binary_tree_level_order_traversal {
    class Solution {
        class Pair{
            TreeNode node;
            int levels;

            Pair(TreeNode node, int levels){
                this.node=node;
                this.levels=levels;
            }
        }
        public List<List<Integer>> levelOrder(TreeNode root) {
            if(root==null)return new ArrayList<>();
            List<List<Integer>> arr=new ArrayList<>(levels(root));
            for(int i=0;i<levels(root);i++){
                arr.add(new ArrayList<>());
            }
            Queue<Pair> q=new ArrayDeque<>();
            q.add(new Pair(root, 0));
            while(!q.isEmpty()){
                Pair front=q.remove();
                arr.get(front.levels).add(front.node.val);
                if(front.node.left!=null)q.add(new Pair(front.node.left, front.levels+1));
                if(front.node.right!=null)q.add(new Pair(front.node.right,front.levels+1));
            }
            return arr;

        }
        int levels(TreeNode root){
            if(root==null)return 0;
            return 1+Math.max(levels(root.left), levels(root.right));
        }
    }
}
