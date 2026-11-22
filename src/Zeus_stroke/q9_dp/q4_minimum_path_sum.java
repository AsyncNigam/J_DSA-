package Zeus_stroke.q9_dp;

import java.util.Arrays;

public class q4_minimum_path_sum {

//    normal recursive approach
class Solution1 {
    public int minPathSum(int[][] grid) {
        return helper(grid.length - 1, grid[0].length - 1, grid);
    }

    int helper(int m, int n, int[][] grid) {
        // 1. Out of bounds check (fixes the -1 index error)
        if (m < 0 || n < 0) return Integer.MAX_VALUE;

        // 2. Destination reached
        if (m == 0 && n == 0) return grid[0][0];

        return grid[m][n] + Math.min(helper(m - 1, n, grid), helper(m, n - 1, grid));
    }
}

//    by memoization
class Solution2 {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(0, 0, m - 1, n - 1, dp, grid);
    }

    int helper(int sr, int sc, int m, int n, int[][] dp, int[][] grid) {
        if (sr > m || sc > n) return Integer.MAX_VALUE;
        if (sr == m && sc == n) return grid[sr][sc];
        if (dp[sr][sc] != -1) return dp[sr][sc];
        return dp[sr][sc] = grid[sr][sc] + Math.min(
                helper(sr + 1, sc, m, n, dp, grid),
                helper(sr, sc + 1, m, n, dp, grid)
        );
    }
}

//by tabulation

}
