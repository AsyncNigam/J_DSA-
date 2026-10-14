package Graphs.q7_prim_algorithm_minimum_spaning_tree;

import java.util.PriorityQueue;
//https://leetcode.com/problems/min-cost-to-connect-all-points/
//this is the direct minimum spanning tree question , here even we do not need to create the adjacency matrix
public class q1_min_cost_to_connect_all_points {
    class Solution {
        class Triplet implements Comparable<Triplet>{
            int node, parent, dist;
            Triplet(int node, int parent, int dist){
                this.node=node;
                this.parent=parent;
                this.dist=dist;
            }
            public int compareTo(Triplet t){
                return Integer.compare(this.dist, t.dist);
            }
        }
        public int minCostConnectPoints(int[][] points) {
            PriorityQueue<Triplet> pq=new PriorityQueue<>();
            pq.add(new Triplet(0,-1,0));
            int n=points.length;
            int sum=0;
            boolean[] visited=new boolean[n];
            while(pq.size()>0){
                Triplet front=pq.remove();
                int node=front.node;
                int parent=front.parent;
                int dist=front.dist;
                if(visited[node])continue;
                sum+=dist;
                visited[node]=true;
                for(int i=0; i<n; i++){
                    if(i==node || i==parent || visited[i])continue;
                    int x1=points[node][0], y1=points[node][1];
                    int x2=points[i][0], y2=points[i][1];
                    int mDis=Math.abs(x1-x2)+Math.abs(y1-y2);
                    pq.add(new Triplet(i,node,mDis));
                }
            }
            return sum;
        }
    }
}
