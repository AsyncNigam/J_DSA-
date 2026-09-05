package Graphs.dfs;

public class q2_number_of_islands {
    class Solution {
        public int numIslands(char[][] grid) {
            if (grid == null || grid.length == 0) return 0;

            int m = grid.length;
            int n = grid[0].length;
            boolean[][] visit = new boolean[m][n];
            int count = 0;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == '1' && !visit[i][j]) {
                        dfs(i, j, grid, visit);
                        count++;
                    }
                }
            }
            return count;
        }

        void dfs(int i, int j, char[][] grid, boolean[][] visit) {
            int m = grid.length;
            int n = grid[0].length;

            // Mark the current cell so you don't visit it again
            visit[i][j] = true;

            if(i-1>=0 && grid[i-1][j]=='1' && visit[i-1][j]==false) dfs(i-1,j,grid,visit);
            if(i+1<=m-1 && grid[i+1][j]=='1' && visit[i+1][j]==false) dfs(i+1,j,grid,visit);
            if(j-1>=0 && grid[i][j-1]=='1' && visit[i][j-1]==false) dfs(i,j-1,grid,visit);
            // Fixed the typo here: changed m-1 to n-1
            if(j+1<=n-1 && grid[i][j+1]=='1' && visit[i][j+1]==false) dfs(i,j+1,grid,visit);
        }
    }
}
