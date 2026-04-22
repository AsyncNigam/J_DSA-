package DYNAMIC_PROGRAMMING;

import java.util.Arrays;

public class ques_11_unique_paths_2 {
    class Solution {
        public int uniquePathsWithObstacles(int[][] arr) {
            int m=arr.length;
            int n=arr[0].length;
            if(arr[0][0]==1 || arr[m-1][n-1]==1)return 0;

            int[][] dp=new int[m][n];
            for(int i=0;i<m;i++){
                Arrays.fill(dp[i],-1);
            }
            return path(0,0,m,n,arr,dp);
        }

        int path(int r,int c,int m,int n,int[][] arr,int[][] dp){
            if(r>=m || c>=n)return 0;  // 1st check this to prevent array index out of bound

            if(arr[r][c]==1)return 0;  // this to for obstacles
            if(r==m-1 && c==n-1)return 1;  // it is the destination reached , mind && not ||

            if(dp[r][c]!=-1)return dp[r][c];
            int rways=path(r+1,c,m,n,arr,dp);
            int lways=path(r,c+1,m,n,arr,dp);
            return dp[r][c]=rways+lways;
        }

    }
}
