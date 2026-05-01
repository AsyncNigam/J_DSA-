package DYNAMIC_PROGRAMMING;

import java.util.Arrays;

public class ques_494_target_sum {

//by brute force approach normal recursion, not giving me tle but too much lengthy , here time complexity= O(2^n) n=arr length

//    class Solution {
//        public int findTargetSumWays(int[] nums, int target) {
//            return ways(0,nums,target);
//        }
//        int ways(int i,int[] nums,int target){
//            if(i==nums.length){
//                if(target==0)return 1;// this means 1 valid path
//                else return 0;
//            }
//            int add=ways(i+1,nums,target-nums[i]); // adding => so subtracting from target
//            int sub=ways(i+1,nums,target+nums[i]); // subtracting => so adding to target
//            return add+sub;
//
//        }
//    }

//by memoization
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i=0;i<nums.length;i++)sum+=nums[i];
        // i from o to n , target -sum+target to taget+sum

        int[][] dp=new int[nums.length][2*sum+1];
        for(int i=0;i<nums.length;i++) Arrays.fill(dp[i],-1);
        return ways(0,nums,target,dp,sum);
    }
    int ways(int i,int[] nums,int target,int[][] dp,int sum){
        if(i==nums.length){
            if(target==0)return 1;// this means 1 valid path
            else return 0;
        }
        if (Math.abs(target) > sum) return 0; // it blokc s too much bigger target which is impossible to reach


        if(dp[i][target+sum]!=-1)return dp[i][target+sum];
        int add=ways(i+1,nums,target-nums[i],dp,sum); // here we are going to index i+1
        int sub=ways(i+1,nums,target+nums[i],dp,sum); // and here also like wise if 1d array then how manage this , so 2d aray
        return dp[i][target+sum]=add+sub;

    }
}

}
