package DYNAMIC_PROGRAMMING;

import java.util.Arrays;

public class ques_05_house_robber2 {
    class Solution {
        public int rob(int[] nums) {
            int n= nums.length;
            if(n==1)return nums[0];
            int[] dp=new int[n+1];
            Arrays.fill(dp,-1);
            int sc1=amount(nums,0,dp,n-1);
            Arrays.fill(dp,-1);
            int sc2=amount(nums,1,dp,n);

            return Math.max(sc1,sc2);
        }
        int amount(int[] nums,int i,int[] dp,int last){
            if(i>=last)return 0;
            if(dp[i]!=-1)return dp[i];
            int take=nums[i]+amount(nums,i+2,dp,last);
            int skip=amount(nums,i+1,dp,last);

            return dp[i]=Math.max(take,skip);
        }

    }
}
