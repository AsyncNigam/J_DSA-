package Graphs;

import java.util.ArrayList;
import java.util.List;

public class q5_cycle_detection_directed_graph_by_DFS {
    class Solution {
        static boolean ans;
        public boolean canFinish(int n, int[][] pre) {
            List<List<Integer>> adj=new ArrayList<>();
            boolean[] visit=new boolean[n];
            boolean[] path=new boolean[n];
            ans=true; // true means no cycle
            for(int i=0;i<n;i++)adj.add(new ArrayList<>());
            for(int i=0;i<pre.length;i++){
                int a=pre[i][0], b=pre[i][1]; //b->a edge
                adj.get(b).add(a);
            }
            for(int i=0;i<n;i++){
                if(!visit[i])dfs(i,adj,visit,path);
            }
            return ans;
        }
        void dfs(int i, List<List<Integer>> adj, boolean[] visit, boolean[] path){
            visit[i]=true;
            path[i]=true;
            for(int ele:adj.get(i)){
                if(path[ele]){
                    ans=false;
                    return;
                }
                if(!visit[ele])dfs(ele,adj,visit,path);
            }
            path[i]=false;
        }
    }
}
