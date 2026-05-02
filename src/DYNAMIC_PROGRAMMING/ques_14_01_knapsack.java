package DYNAMIC_PROGRAMMING;


import java.util.Arrays;

public class ques_14_01_knapsack {

//by normal recursion method time=O(2^n)

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


//    by memoization time ,space=O(n*c)

//    class Solution { //
//        public int knapsack(int W, int val[], int wt[]) {
//            // code here
//            return check(0,W,val,wt);
//        }
//
//        public int check(int i,int c, int val[], int wt[]) {
//
// //            for the size of the dp , look the varibales in normal recursion method which are changing , then see the no. of times they are changing that will be the size of the row or column
//
// //            c from c to 0 , c+1 , i from o to wt.length-1
//            int n=wt.length;
//            int[][] dp=new int[n][c+1];
//            for(int j=0;j<dp.length;j++) Arrays.fill(dp[j],-1);
//            return profit(0,c,val,wt,dp);
//        }
//
//        int profit(int i,int c,int[] val,int[] wt,int[][] dp){
//            if(i==wt.length)return 0;
//            if(dp[i][c]!=-1)return dp[i][c];
//            int skip=profit(i+1,c,val,wt,dp);
//            if(wt[i]>c)return dp[i][c]=skip;
//            int take=val[i]+profit(i+1,c-wt[i],val,wt,dp);
//            return dp[i][c]=Math.max(skip,take);
//        }
//    }


//    by tabulation
class Solution {
        public int knapsack(int W, int val[], int wt[]) {
            // code here
            return check(0,W,val,wt);
        }

        public int check(int i,int c, int val[], int wt[]) {

 //            for the size of the dp , look the varibales in normal recursion method which are changing , then see the no. of times they are changing that will be the size of the row or column
 //            c from c to 0 , c+1 , i from o to wt.length-1
            int n=wt.length;
            int[][] dp=new int[n][c+1];
            for(int j=0;j<dp.length;j++) Arrays.fill(dp[j],-1);
            return profit(0,c,val,wt,dp);
        }

        int profit(int i,int c,int[] val,int[] wt,int[][] dp){
            if(i==wt.length)return 0;
            if(dp[i][c]!=-1)return dp[i][c];
            int skip=profit(i+1,c,val,wt,dp);
            if(wt[i]>c)return dp[i][c]=skip;
            int take=val[i]+profit(i+1,c-wt[i],val,wt,dp);
            return dp[i][c]=Math.max(skip,take);
        }
    }



}