package Binary_tree.video2;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

//leetcode

public class Binary_tree_level_order_traversal {
    class Pair {
        TreeNode node;
        int level;
        Pair(TreeNode node,int level) {
            this.node = node;
            this.level=level;
        }
    }

    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
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
            return list;
        }
        int levels(TreeNode root){
            if(root==null)return 0;
            return 1+Math.max(levels(root.left),levels(root.right));
        }
    }
}
