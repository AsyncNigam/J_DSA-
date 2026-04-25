package DYNAMIC_PROGRAMMING;

import java.util.Arrays;

public class ques_16_partition_equal_subsets_sum {
    class Solution {
        public boolean canPartition(int[] arr) {
            int sum=0;
            for(int el:arr)sum+=el;
            if(sum%2!=0)return false; //if odd sum can never be true
            int target=sum/2;
//        i is varying from 0 to n-1, sum from sum to 0
            int n= arr.length;
            int[][] dp=new int[n][sum+1];
            for(int i=0;i<n;i++){
                Arrays.fill(dp[i],-1);
            }
            return find(arr,target,0,dp);
        }
        Boolean find(int[] arr, int sum, int i, int[][] dp){
            if(sum==0)return true;
            if(i==arr.length)return false;
            if(dp[i][sum]!=-1)return dp[i][sum]==1;
            boolean skip=find(arr,sum,i+1,dp);
            if(sum<arr[i]){
                dp[i][sum] = skip ? 1 : 0;
                return skip;
            }
            boolean take=find(arr,sum-arr[i],i+1,dp);
            dp[i][sum] = (take || skip) ? 1 : 0;
            return take||skip;
        }
    }
}
