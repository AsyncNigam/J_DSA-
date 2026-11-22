package Zeus_stroke.q9_dp;

public class q3_unique_paths {
    class Solution {
        public int uniquePaths(int m, int n) {
            int[][] dp=new int[m+1][n+1];
            return helper(0, 0, m-1, n-1, dp);
        }
        int helper(int sRow, int sCol, int m, int n, int[][]dp){
            if(sRow==m || sCol==n)return 1;
            if(sRow>m || sCol>n)return 0;
            if(dp[sRow][sCol]!=0)return dp[sRow][sCol];
            return dp[sRow][sCol]=helper(sRow+1, sCol, m, n, dp) + helper(sRow, sCol+1, m, n, dp);
        }
    }
}
