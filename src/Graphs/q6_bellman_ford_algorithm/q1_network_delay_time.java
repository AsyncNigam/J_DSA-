package Graphs.q6_bellman_ford_algorithm;

import java.util.Arrays;

public class q1_network_delay_time {
    class Solution {
        public int networkDelayTime(int[][] times, int n, int src) {
            int[] dist=new int[n+1];
            Arrays.fill(dist,Integer.MAX_VALUE);
            dist[src]=0;
            // Run relaxation n - 1 times
            for (int i = 1; i < n; i++) {
                // Iterate through ALL edges starting at index 0
                for (int j = 0; j < times.length; j++) {
                    int u = times[j][0];
                    int v = times[j][1];
                    int wt = times[j][2];

                    if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                    }
                }
            }

            // this negative cycle detection is not needed for the questioin but it is the copmplete bellman ford algorithm , you cn skip this part for this question
            //now one time again to catch if there is negative cycle, in negative cycle the overal weight of the graph is negative so if we again run the loop and if we get smaller values for any node then it indicates negative cycle present in the graph
            for (int j = 0; j < times.length; j++) {
                int u = times[j][0];
                int v = times[j][1];
                int wt = times[j][2];

                if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                    return -1; //indicating a negative cycle
                }
            }

            //max
            int max=-1;
            for(int i=1;i<=n;i++){
                if(dist[i]==Integer.MAX_VALUE)return -1;
                max=Math.max(max, dist[i]);
            }
            return max;
        }
    }
}
