package Graphs.dfs;

public class q1_number_of_privinces {
    class Solution {
        public int findCircleNum(int[][] adj) {
            int n=adj.length;
            int count=0;
            boolean[] visit=new boolean[n];
            for(int i=0;i<n;i++){
                if(!visit[i]){
                    dfs(i,adj,visit);
                    count++;
                }
            }
            return count;
        }
        void dfs(int i, int[][] adj, boolean[] visit){
            visit[i]=true;
            for(int j=0;j<adj.length;j++){
                if(adj[i][j]==1 && !visit[j]){
                    dfs(j,adj,visit);
                }
            }
        }
    }
}
