package DYNAMIC_PROGRAMMING;

import java.util.Arrays;

public class ques_02_min_cost_climbing_stairs {

//    this is the basic recursive approach , but here time limit exceeds

//    class Solution {
//        public int minCostClimbingStairs(int[] cost) {
//            int n=cost.length;
//            return Math.min(minCost(n-1,cost),minCost(n-2,cost));
//        }
//
//        int minCost(int i,int[] arr){
//            if(i<=1)return arr[i];
//            return arr[i]+Math.min(minCost(i-1,arr),minCost(i-2,arr));
//        }
//    }

//    by memoization
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1); // because given that in cost array the values can be from 0 to 999, if we leave that(as previous of Fibonacci) array then there will issue so keeping with -1

        return Math.min(minCost(n-1,cost,dp),minCost(n-2,cost,dp));
    }

    int minCost(int i,int[] arr,int[] dp){
        if(i<=1)return arr[i];
        if(dp[i]!=-1)return dp[i];
        return dp[i]=arr[i]+Math.min(minCost(i-1,arr,dp),minCost(i-2,arr,dp));
    }
}


}
