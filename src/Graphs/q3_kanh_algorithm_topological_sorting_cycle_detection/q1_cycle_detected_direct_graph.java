package Graphs.q3_kanh_algorithm_topological_sorting_cycle_detection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class q1_cycle_detected_direct_graph {
//    https://leetcode.com/problems/course-schedule/description/

    class Solution {
        public boolean canFinish(int n, int[][] pre) {
            List<List<Integer>> adj=new ArrayList<>();
            int[] indegree=new int[n];
            for(int i=0;i<n;i++)adj.add(new ArrayList<>());
            for(int i=0;i<pre.length;i++){
                int a=pre[i][0], b=pre[i][1]; //b->a edge
                adj.get(b).add(a);
                indegree[a]++;
            }

            //Kahn's algorithm, in Kahn's algorithm you do not need visited array
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
                for(int ele: adj.get(front)){
                    indegree[ele]--;
                    if(indegree[ele]==0){
                        q.add(ele);
                    }
                }
            }
            return ans.size()==n;
        }
    }
}
