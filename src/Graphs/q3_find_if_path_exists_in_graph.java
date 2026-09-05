package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


//here the input types of the graph are different from the number of provinces question here the graph input matrix is not adjacency matrix it is input like path
//so 1st created an adjacency list then bfs
public class q3_find_if_path_exists_in_graph {
    class Solution {
        public boolean validPath(int n, int[][] edges, int source, int destination) {

            if(source== destination)return true;
            List<List<Integer>> adj=new ArrayList<>();
            for(int i=0;i<n;i++)adj.add(new ArrayList<>());

            for(int i=0;i<edges.length;i++){
                int a=edges[i][0];
                int b=edges[i][1];
                adj.get(a).add(b);
                adj.get(b).add(a);
            }
            boolean[] visit=new boolean[n];
            bfs(source, adj, visit);
            return visit[destination];
        }

        void bfs(int start, List<List<Integer>> adj, boolean[] visit){
            Queue<Integer> q=new LinkedList<>();
            q.add(start);
            while(!q.isEmpty()){
                int front=q.remove();
                for(int ele : adj.get(front)){
                    if(!visit[ele]){
                        visit[ele]=true;
                        q.add(ele);
                    }
                }
            }
        }
    }
}
