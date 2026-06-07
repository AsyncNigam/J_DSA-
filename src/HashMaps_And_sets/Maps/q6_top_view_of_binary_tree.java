package HashMaps_And_sets.Maps;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class q6_top_view_of_binary_tree {
    class Node{
        int data;
        Node left, right;

        Node(int val) {
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }
    class Pair {
        Node node;
        int dist;
        Pair(Node node, int dist) {
            this.node = node;
            this.dist = dist;
        }
    }
    class Solution {
        public ArrayList<Integer> topView(Node root) {
            ArrayList<Integer> ans = new ArrayList<Integer>();
            HashMap<Integer, Integer> map = new HashMap<>();
            Queue<Pair> q = new LinkedList<>();
            q.add(new Pair(root, 0));
            int minDist = Integer.MAX_VALUE;
            int maxDist = Integer.MIN_VALUE;
            while (q.size() != 0) {
                Pair front = q.remove();
                Node node = front.node;
                int dist = front.dist;
                minDist = Math.min(minDist, dist);
                maxDist = Math.max(maxDist, dist);
                if (!map.containsKey(dist))map.put(dist, node.data);

                if (node.left != null)q.add(new Pair(node.left, dist - 1));
                if (node.right != null)q.add(new Pair(node.right, dist + 1));

            }
            for (int i = minDist; i <= maxDist; i++)ans.add(map.get(i));
            return ans;

        }
    }

}
