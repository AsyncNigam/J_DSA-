package Backtracking;

public class q5_check_knight_tour_configuration_leetcode {
    class Solution {
        public boolean checkValidGrid(int[][] grid) {
            if(grid[0][0]!=0)return false;
            return helper(grid,0,0);
        }
        boolean helper(int[][] grid, int row, int col){
            int n=grid.length;
            if(grid[row][col]==n*n-1)return true;
            int i=row, j=col;
            // 2up right
            i=row+2;
            j=col+1;
            if(i<n && j<n && grid[i][j]==grid[row][col]+1)return helper(grid,i,j);
            // 2up left
            i=row+2;
            j=col-1;
            if(i<n && j>=0 && grid[i][j]==grid[row][col]+1)return helper(grid,i,j);
            // 2down right
            i=row-2;
            j=col+1;
            if(i>=0 && j<n && grid[i][j]==grid[row][col]+1)return helper(grid,i,j);
            // 2down left
            i=row-2;
            j=col-1;
            if(i>=0 && j>=0 && grid[i][j]==grid[row][col]+1)return helper(grid,i,j);
            // 2right up
            i=row+1;
            j=col+2;
            if(i<n && j<n && grid[i][j]==grid[row][col]+1)return helper(grid,i,j);
            // 2right down
            i=row-1;
            j=col+2;
            if(i>=0 && j<n && grid[i][j]==grid[row][col]+1)return helper(grid,i,j);
            // 2left up
            i=row+1;
            j=col-2;
            if(i<n && j>=0 && grid[i][j]==grid[row][col]+1)return helper(grid,i,j);
            // 2left down
            i=row-1;
            j=col-2;
            if(i>=0 && j>=0 && grid[i][j]==grid[row][col]+1)return helper(grid,i,j);

            return false;
        }
    }
}
