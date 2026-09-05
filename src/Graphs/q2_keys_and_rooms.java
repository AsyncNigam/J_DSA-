package Graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


//https://leetcode.com/problems/keys-and-rooms/

//auxiliary space=O(n) beacuse taking an additional visited array and an queue

//time complexity O(no. of nodes + no. of edges)
public class q2_keys_and_rooms {
    class Solution {
        public boolean canVisitAllRooms(List<List<Integer>> adj) {
            int n=adj.size();
            boolean[] visit=new boolean[n];
            visit[0]=true;
            bfs(0, adj, visit);

            for(boolean ele:visit)if(!ele)return ele;
            return true;
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
