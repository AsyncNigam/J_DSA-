package DYNAMIC_PROGRAMMING;


import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1

public class ques_14_01_knapsack {

//by normal recursion method time=O(2^n) and space is O(n*c)

//    class Solution {
//        public int knapsack(int W, int val[], int wt[]) {
//            // code here
//            return profit(0,W,val,wt);
//        }
//
//        int profit(int i,int c,int[] val,int[] wt){
//            if(i==wt.length)return 0;
//            int skip=profit(i+1,c,val,wt);
//            if(wt[i]>c)return skip;
//            int take=val[i]+profit(i+1,c-wt[i],val,wt);
//            return Math.max(skip,take);
//        }
//    }


//    by memoization time=O(n*c) ,space=O(n*c),
//    here i =  0 to n-1 and c= c to 0 (c is capacity)
//    as here 2 things are varying i and c , so here there will be a 2d dp


    //  for the size of the dp , look the variables in normal recursion method which are changing , then see the no. of times they are changing that will be the size of the row or column
    class Solution2 {
        public int knapsack(int c, int val[], int wt[]) {
            // code here
            int n = val.length;
            int[][] dp = new int[n][c + 1];
            for (int i = 0; i < n; i++) Arrays.fill(dp[i], -1);
            return profit(0, c, val, wt, dp);
        }

        int profit(int i, int c, int[] val, int[] wt, int[][] dp) {
            if (i == wt.length) return 0;
            if (dp[i][c] != -1) return dp[i][c];
            int skip = profit(i + 1, c, val, wt, dp);
            if (wt[i] > c) return dp[i][c] = skip;
            int take = val[i] + profit(i + 1, c - wt[i], val, wt, dp);
            return dp[i][c] = Math.max(skip, take);
        }
    }
}