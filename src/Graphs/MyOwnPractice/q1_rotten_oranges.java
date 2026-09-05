package Graphs.MyOwnPractice;

import java.util.ArrayDeque;
import java.util.Queue;

public class q1_rotten_oranges {
    class Solution {
        class Pair{
            int row;
            int col;
            Pair(int row, int col){
                this.row=row;
                this.col=col;
            }
        }
        public int orangesRotting(int[][] grid) {
            int m=grid.length;
            int n=grid[0].length;
            Queue<Pair> q=new ArrayDeque<>();

            int fresh=0;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(grid[i][j]==2)q.add(new Pair(i,j));
                    else if(grid[i][j]==1)fresh++;
                }
            }
            if(fresh==0)return 0;

            int minutes=0;
            int[][] dirs={{-1,0},{1,0},{0,-1},{0,1}};


            while(!q.isEmpty() && fresh>0){
                int size = q.size(); // Freeze the number of elements at this exact minute
                for(int i=0;i<size;i++){
                    Pair p=q.remove();
                    for(int[] dir:dirs){
                        int r=p.row+dir[0];
                        int c=p.col+dir[1];

                        if(r>=0 && r<m && c>=0 && c<n && grid[r][c]==1){
                            grid[r][c]=2;
                            q.add(new Pair(r,c));
                            fresh--;
                        }
                    }
                }
                minutes++;
            }

            return fresh==0 ? minutes : -1;

        }
    }
}
