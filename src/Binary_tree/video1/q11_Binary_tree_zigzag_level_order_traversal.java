package Binary_tree.video1;

import java.util.*;

public class q11_Binary_tree_zigzag_level_order_traversal {
    class Solution {

        class Pair {
            TreeNode node;
            int level;
            Pair(TreeNode node,int level) {
                this.node = node;
                this.level=level;
            }
        }
        int levels(TreeNode root){
            if(root==null)return 0;
            return 1+Math.max(levels(root.left),levels(root.right));
        }
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            if (root == null) return new ArrayList<>();
            List<List<Integer>> list=new ArrayList<>(levels(root));
            for(int i=0;i<levels(root);i++){
                list.add(new ArrayList<>());
            }
            Queue<Pair> q=new LinkedList<>();

            q.add(new Pair(root,0));
            while(q.size()>0){
                Pair front=q.remove();
                list.get(front.level).add(front.node.val);
                if(front.node.left!=null)q.add(new Pair(front.node.left,front.level+1));
                if(front.node.right!=null)q.add(new Pair(front.node.right,front.level+1));
            }

            for(int i=0;i<list.size();i++){
                if(i%2!=0) Collections.reverse(list.get(i));
            }
            return list;
        }
    }
}
