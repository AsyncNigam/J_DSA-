package Graphs.q6_dikjstra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;


//https://leetcode.com/problems/network-delay-time/

public class q1_network_delay_time {
    class Solution {
        class Pair implements Comparable<Pair>{
            int node;
            int time;
            Pair(int node, int time){
                this.node=node;
                this.time=time;
            }
            public int compareTo(Pair p){
                if(this.time==p.time)return this.node-p.node;
                return this.time-p.time;
            }
        }
        public int networkDelayTime(int[][] times, int n, int src) {
            //to make the adjacency list
            List<List<Pair>> adj=new ArrayList<>();
            for(int i=0;i<=n;i++)adj.add(new ArrayList<>());
            for(int i=0;i<times.length;i++){
                int u=times[i][0], v=times[i][1], t=times[i][2];
                adj.get(u).add(new Pair(v,t));
            }
            // now using dikjstra
            int[] ans=new int[n+1];
            Arrays.fill(ans,Integer.MAX_VALUE);
            ans[src]=0;
            PriorityQueue<Pair> pq=new PriorityQueue<>();
            pq.add(new Pair(src, 0));
            while(pq.size()>0){
                Pair top=pq.remove();
                int node=top.node, time=top.time;
                for(Pair p:adj.get(node)){
                    int totalTime=time+p.time;
                    if(totalTime<ans[p.node]){
                        ans[p.node]=totalTime;
                        pq.add(new Pair(p.node, totalTime));
                    }
                }
            }

            //find max distance from src
            int max=-1;
            for(int i = 1; i <= n; i++){
                if(ans[i] == Integer.MAX_VALUE) return -1;
                max = Math.max(ans[i], max);
            }
            return max;
        }
    }
}
