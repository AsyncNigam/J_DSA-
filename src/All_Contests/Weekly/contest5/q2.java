package All_Contests.Weekly.contest5;
//https://leetcode.com/problems/last-visited-cell-in-a-directional-grid/description/
public class q2 {
    class Solution {
        public int[] lastVisitedCell(char[][] grid) {
            int m=grid.length;
            int n=grid[0].length;
            boolean[][] visit=new boolean[m][n];
            int[] prev=new int[2];
            int i=0,j=0;
            while(i>=0 && i<m && j>=0 && j<n){
                if(visit[i][j])return prev;
                visit[i][j]=true;
                prev=new int[]{i,j};
                switch(grid[i][j]){
                    case 'R'->j++;
                    case 'D'->i++;
                    case 'U'->i--;
                    case 'L'->j--;
                }

            }
            return prev;
        }
    }
}
