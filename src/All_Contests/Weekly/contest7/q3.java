package All_Contests.Weekly.contest7;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/contest/weekly-contest-527/problems/minimum-cost-to-make-red-nodes-connected/
public class q3 {
    class Solution {
        private List<Integer>[] adj;
        private int[] subtreeSize;
        private String col;

        public long minCost(int n, String colors, int[][] edges) {
            this.col = colors;
            adj = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new ArrayList<>();
            }
            for (int[] e : edges) {
                adj[e[0]].add(e[1]);
                adj[e[1]].add(e[0]);
            }

            subtreeSize = new int[n];
            computeSubtreeSize(0, -1);


            long[] res = dfs(0, -1);

            return Math.min(res[0], Math.min(res[1], res[2]));
        }

        private void computeSubtreeSize(int u, int p) {
            subtreeSize[u] = 1;
            for (int v : adj[u]) {
                if (v != p) {
                    computeSubtreeSize(v, u);
                    subtreeSize[u] += subtreeSize[v];
                }
            }
        }

        private long[] dfs(int u, int p) {
            long baseBlue = (col.charAt(u) == 'R') ? subtreeSize[u] : 0L;
            long baseRed = (col.charAt(u) == 'B') ? subtreeSize[u] : 0L;

            long sumEmpty = 0;
            long sumRedChildren = 0;
            long bestDiff = Long.MAX_VALUE / 2;

            for (int v : adj[u]) {
                if (v == p) continue;
                long[] childDp = dfs(v, u);

                sumEmpty += childDp[0];
                sumRedChildren += Math.min(childDp[0], childDp[1]);


                long bestChildComponent = Math.min(childDp[1], childDp[2]);
                bestDiff = Math.min(bestDiff, bestChildComponent - childDp[0]);
            }

            long dp0 = baseBlue + sumEmpty;
            long dp1 = baseRed + sumRedChildren;
            long dp2 = (bestDiff < Long.MAX_VALUE / 4) ? (baseBlue + sumEmpty + bestDiff) : Long.MAX_VALUE / 2;

            return new long[]{dp0, dp1, dp2};
        }
    }
}
