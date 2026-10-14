package Graphs.q4_dikjstra;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class q2_path_with_maximum_probability {
    class Solution {
        class Pair implements Comparable<Pair>{
            int node;
            double prob;
            Pair(int node, double prob){
                this.node=node;
                this.prob=prob;
            }

            public int compareTo(Pair p){  //in java compareTo only be int
                if(this.prob == p.prob) return this.node - p.node;
                // Returns positive if p.prob > this.prob (for max-heap behavior)
                return Double.compare(p.prob, this.prob); //in java compareTo only be int, and directly can not return p.prob-this.prob because they are double and the method is int so Double.compare()
            }
        }
        public double maxProbability(int n, int[][] edges, double[] succ, int start_node, int end_node) {
            //adjacency list
            List<List<Pair>> adj=new ArrayList<>();
            for(int i=0;i<=n;i++)adj.add(new ArrayList<>());
            for(int i=0; i<edges.length;i++){
                int a=edges[i][0];
                int b=edges[i][1];
                double c=succ[i];
                adj.get(a).add(new Pair(b, c));
                adj.get(b).add(new Pair(a, c));
            }

            //Dikjstra
            double[] ans=new double[n+1];
            ans[start_node]=1;  // to self probability is 1 and for others already 0 probability does not need Integer.MIN_VALUE
            PriorityQueue<Pair> pq=new PriorityQueue<>();  //here it will be a max heap, on top it will return the max probability
            pq.add(new Pair(start_node,1.0));
            while(pq.size()>0){
                Pair top=pq.remove();
                int node=top.node;
                double prob=top.prob;
                for(Pair p:adj.get(node)){
                    double totalProb=p.prob*prob;
                    if(ans[p.node]<totalProb){
                        ans[p.node]=totalProb;
                        pq.add(new Pair(p.node, totalProb));
                    }
                }
            }

            return ans[end_node];
        }
    }
}
