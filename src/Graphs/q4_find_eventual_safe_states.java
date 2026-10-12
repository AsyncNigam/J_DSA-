package Graphs;

import java.util.*;
//https://leetcode.com/problems/find-eventual-safe-states/
public class q4_find_eventual_safe_states {
    class Solution {
        public List<Integer> eventualSafeNodes(int[][] graph) {
            int n=graph.length;
            List<List<Integer>> adj=new ArrayList<>();
            for(int i=0;i<n;i++)adj.add(new ArrayList<>());
            int[] indegree=new int[n];
            for(int i=0;i<n;i++){
                for(int ele: graph[i]){
                    //we are reversing in original adjacency matrix the order is like i to ele but as to find the safe state node we are using the reverse one
                    adj.get(ele).add(i);
                    indegree[i]++;
                }
            }
            // Applying Kanh's Algorithm
            Queue<Integer> q=new ArrayDeque<>();
            List<Integer> ans=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(indegree[i]==0){
                    q.add(i);
                }
            }
            while(q.size()>0){
                int front=q.remove();
                ans.add(front);
                for(int ele : adj.get(front)){
                    indegree[ele]--;
                    if(indegree[ele]==0)q.add(ele);
                }
            }
            //because question states to return in reverse order
            Collections.sort(ans);
            return ans;
        }
    }
}
