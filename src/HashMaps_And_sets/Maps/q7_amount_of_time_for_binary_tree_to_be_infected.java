package HashMaps_And_sets.Maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/

public class q7_amount_of_time_for_binary_tree_to_be_infected {

    class Solution {
        void parent(TreeNode root, HashMap<TreeNode, TreeNode> map){
            if(root==null)return ;
            if(root.right!=null)  map.put(root.right,root);
            if(root.left!=null) map.put(root.left,root);
            parent(root.left,map);
            parent(root.right,map);
        }
        TreeNode find_Node(TreeNode root, int start){
            if(root==null)return null;
            if(root.val==start)return root;
            TreeNode left=find_Node(root.left,start);
            if(left!=null)return left;
            return find_Node(root.right,start);
        }
        public int amountOfTime(TreeNode root, int start) {
            HashMap<TreeNode, TreeNode> map =new HashMap<>();
            TreeNode target=find_Node(root, start);
            parent(root,map);
            Queue<Pair> q=new LinkedList<>();
            q.add(new Pair(target,0));
            HashSet<TreeNode> set=new HashSet<>();
            set.add(target);
            int time=0;
            while(q.size()>0){
                Pair front=q.remove();
                TreeNode node=front.node;
                int dist=front.dist;
                time=Math.max(time,dist);
                if(node.left!=null && !set.contains(node.left)){
                    q.add(new Pair(node.left,dist+1));
                    set.add(node.left);
                }
                if(node.right!=null && !set.contains(node.right)){
                    q.add(new Pair(node.right,dist+1));
                    set.add(node.right);
                }
                if(map.containsKey(node) && !set.contains(map.get(node))){
                    q.add(new Pair(map.get(node),dist+1));
                    set.add(map.get(node));
                }
            }
            return time;
        }

    }
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
    class Pair{
        TreeNode node;
        int dist;
        Pair(TreeNode node, int dist){
            this.node=node;
            this.dist=dist;
        }
    }

}
