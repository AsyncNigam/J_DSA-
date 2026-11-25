package DYNAMIC_PROGRAMMING;

import java.util.Arrays;
public class ques_15_painting_the_walls {

    // https://leetcode.com/problems/painting-the-walls/
    public class Painting_The_Walls {

        // By normal recursion: Time = O(2^n), Space = O(n)
        // Two variables change: i (0 to n-1) and remain (n to 0) -> 2D DP needed

        // By memoization: Time = O(n * n), Space = O(n * n)
        class Solution {
            int INF = 1_000_000_000; // Safe infinity to prevent integer overflow on addition

            public int paintWalls(int[] cost, int[] time) {
                int n = cost.length;
                // dp[i][remain] -> i varies from 0 to n-1, remain varies from n to 0
                int[][] dp = new int[n][n + 1];
                for (int i = 0; i < n; i++) Arrays.fill(dp[i], -1);

                return solve(0, n, cost, time, dp);
            }

            int solve(int i, int remain, int[] cost, int[] time, int[][] dp) {
                // Base case 1: All required walls are painted (even if remain goes negative)
                if (remain <= 0) return 0;

                // Base case 2: Out of walls to hire paid painter, but walls still remain
                if (i == cost.length) return INF;

                if (dp[i][remain] != -1) return dp[i][remain];

                // Option 1: Skip wall i (do not hire paid painter for wall i)
                int skip = solve(i + 1, remain, cost, time, dp);

                // Option 2: Take wall i (paid painter paints 1 wall + free painter paints time[i] walls)
                // Use Math.max(0, ...) so remain doesn't go out of bounds in dp array
                int nextRemain = Math.max(0, remain - 1 - time[i]);
                int take = cost[i] + solve(i + 1, nextRemain, cost, time, dp);

                return dp[i][remain] = Math.min(skip, take);
            }
        }
    }
}
