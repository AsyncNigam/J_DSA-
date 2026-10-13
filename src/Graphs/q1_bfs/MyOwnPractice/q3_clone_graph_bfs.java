package Graphs.q1_bfs.MyOwnPractice;

import java.util.*;

//https://leetcode.com/problems/clone-graph/description/

public class q3_clone_graph_bfs {
    class Node {
        Node(int val){
            this.val=val;
        }
        public int val;
        public List<Node> neighbors;
    }
    class Solution {
        public Node cloneGraph(Node node) {
            if (node == null) return null;

            Map<Node, Node> map = new HashMap<>();
            Queue<Node> queue = new LinkedList<>();

            map.put(node, new Node(node.val));
            queue.add(node);

            while (!queue.isEmpty()) {
                Node curr = queue.poll();

                for (Node neighbor : curr.neighbors) {
                    // Clone the neighbor if it hasn't been visited
                    if (!map.containsKey(neighbor)) {
                        map.put(neighbor, new Node(neighbor.val));
                        queue.add(neighbor);
                    }
                    // Add the cloned neighbor to the current cloned node's list
                    map.get(curr).neighbors.add(map.get(neighbor));
                }
            }

            return map.get(node);
        }
    }
}
