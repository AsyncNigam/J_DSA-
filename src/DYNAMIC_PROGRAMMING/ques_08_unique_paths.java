package DYNAMIC_PROGRAMMING;

import java.util.Arrays;

public class ques_08_unique_paths {

//   unique path with more time complexity
//    public int uniquePaths(int m,int n){
//        if(m==1||n==1)return 1;
//        return uniquePaths(m-1,n)+uniquePaths(m,n-1);
//    }

//    another way solving the unique way like matrix in the input
//    we are given the grid order

//    let's solve like a 2d matrix like starting from 0th indices to
//    length-1 indices with helper function

// public int unique_paths(int m, int n){
// //        this will call the helper function and rest
// //        of the things will be done in the helper
//    return path(0,0,m-1,n-1);
//}
//
//    private int path(int s_row, int s_col, Integer e_row, Integer e_col) {
//
//        if(s_row==e_row||s_col==e_col)return 1;
//        if(s_row>e_row||s_col>e_col)return 0; //if it goes out of bound
//        int right=path(s_row+1,s_col,e_row,e_col); //counting the right parts
//        int left=path(s_row,s_col+1,e_row,e_col); //counting the left parts
//
//        return right+left; // it is the sum of right and left
//    }

//    by 2d memoization
//here also time=O(m*n), space==O(m*n)

//    class Solution {
//    public int uniquePaths(int m, int n) {
//        int[][] dp=new int[m][n];
//        for(int i=0;i<m;i++){
//            Arrays.fill(dp[i],-1);
//        }
//        return path(0,0,m,n,dp);
//    }
//    int path(int r,int c,int m,int n,int[][] dp){
//        if(r>=m||c>=n)return 0;
//        if(r==m-1 && c==n-1)return 1;
//        if(dp[r][c]!=-1)return dp[r][c];
//        int rways=path(r+1,c,m,n,dp);
//        int lways=path(r,c+1,m,n,dp);
//        return dp[r][c]=rways+lways;
//    }
//}

//by tabulation method , here also time=O(m*n), space==O(m*n)
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0)dp[i][j]=1;
                else dp[i][j]=dp[i][j-1]+dp[i-1][j];
            }
        }
        return dp[m-1][n-1];
    }
}
}
