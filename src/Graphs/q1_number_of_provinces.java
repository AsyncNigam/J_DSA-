package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class q1_number_of_provinces {
//    time complxity worst case= O(n^2), average time complexity for adjacency list= O(v+2E)
//
    class Solution {
        public int findCircleNum(int[][] adj) {
            int n=adj.length;
            int count=0;
            boolean[] vis=new boolean[n];
            for(int i=0;i<n;i++){
                if(!vis[i]){
                    bfs(i,vis,adj);
                    count++;
                }
            }
            return count;
        }
        void bfs(int i, boolean[] vis, int[][] adj){
            vis[i]=true;
            Queue<Integer> q=new LinkedList<>();
            q.add(i);
            while(q.size()>0){
                int front=q.remove();
                for(int j=0;j<adj.length;j++){
                    if(adj[front][j]==1 && vis[j]==false){
                        q.add(j);
                        vis[j]=true;
                    }
                }
            }
        }
    }
}
