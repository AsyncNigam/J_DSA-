package DYNAMIC_PROGRAMMING;

import java.util.Arrays;

public class ques_04_house_robber {
//     brute force approach is by taking and skipping but this recursive code will become time limit exceeded

//    class Solution {
//        public int rob(int[] nums) {
//            return amount(nums,0);
//        }
//        int amount(int[] nums,int i){
//            if(i>=n)return 0;
//
//            int take=nums[i]+amount(nums,i+2);
//            int skip=amount(nums,i+1);
//
//            return Math.max(take,skip);
//        }
//    }

//    with memoization
//class Solution {
////    i will vay from 0 to n-1
// //   dp will store the value of amount[i]
//    public int rob(int[] nums) {
//        int n= nums.length;
//
//        int[] dp=new int[n+1];
//        Arrays.fill(dp,-1);
//        return amount(nums,0,dp);
//    }
//    int amount(int[] nums,int i,int[] dp){
//        int n= nums.length;
//
//        if(i>=n)return 0;
//        if(dp[i]!=-1)return dp[i];
//        int take=nums[i]+amount(nums,i+2,dp);
//        int skip=amount(nums,i+1,dp);
//
//        return dp[i]=Math.max(take,skip);
//    }
//}

//by tabulation
class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        if(n==1)return nums[0];
        int[] dp=new int[n];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    }
}
}
