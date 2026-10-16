package GREEDY;

import java.util.Arrays;
//https://www.geeksforgeeks.org/problems/shortest-job-first/1
public class q3_shortest_job_first_gfg {
    class Solution {
        static int solve(int bt[]) {
            // code here
            int t=0;
            int m=t;
            Arrays.sort(bt);
            for(int el:bt){m+=t;
                t+=el;
            }
            return m/bt.length;
        }
    }

}
