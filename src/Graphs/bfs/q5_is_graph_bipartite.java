package Graphs.bfs;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

// https://leetcode.com/problems/is-graph-bipartite/description/
public class q5_is_graph_bipartite {
    class Solution {
        static boolean ans;
        public boolean isBipartite(int[][] adj) {
            ans=true;
            int[] visited=new int[adj.length];
            Arrays.fill(visited,-1);
            for(int i=0;i<visited.length;i++){
                if(visited[i]==-1)bfs(i,adj,visited);
                if(!ans)return false;
            }
            return ans;
        }
        void bfs(int i,int[][] adj, int[] visit){
            Queue<Integer> q=new ArrayDeque<>();
            visit[i]=0;
            q.add(i);
            while(!q.isEmpty()){
                int front=q.remove();
                int color=visit[front];
                for(int ele:adj[front]){
                    if(visit[ele]==color){
                        ans=false;
                        return ;
                    }
                    if(visit[ele]==-1){
                        visit[ele]=1-color;
                        q.add(ele);
                    }
                }
            }
        }
    }
}
