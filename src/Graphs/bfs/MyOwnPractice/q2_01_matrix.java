package Graphs.bfs.MyOwnPractice;

import java.util.ArrayDeque;
import java.util.Queue;

//https://leetcode.com/problems/01-matrix/description/
public class q2_01_matrix {
    class Solution {
        public int[][] updateMatrix(int[][] mat) {
            int m=mat.length;
            int n=mat[0].length;
            Queue<int[]> q=new ArrayDeque<>();

            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(mat[i][j]==0)q.add(new int[]{i,j});
                    else mat[i][j]=-1;
                }
            }

            int[][] dirs={{-1,0},{1,0},{0,-1},{0,1}};
            while(q.size()>0){
                int[] front=q.remove();
                int r=front[0];
                int c=front[1];

                for(int[] dir : dirs){
                    int nr=r+dir[0];
                    int nc=c+dir[1];

                    if(nc>=0 && nr>=0 && nr<m && nc<n && mat[nr][nc]==-1){
                        mat[nr][nc] = mat[r][c] + 1; // here it is r and c not nr nc we are voerwiting nr nc indices value with r c value +1 , 1 is the disance to neighboura
                        q.add(new int[]{nr, nc});
                    }
                }
            }
            return mat;

        }
    }
}
