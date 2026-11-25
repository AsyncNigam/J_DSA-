package DYNAMIC_PROGRAMMING;

import java.util.Arrays;

public class ques_16_partition_equal_subsets_sum {

//   This is normal memorization techniques and using to DP and knapSack. Exactly it is knapSack but here the thing is, there is only one array and it is a little bit easier than the knapSack one.
    class Solution1 {
        public boolean canPartition(int[] nums) {
            int n=nums.length;
            int sum=0;
            for(int ele:nums)sum+=ele;
            if(sum%2!=0)return false;
            int target=sum/2;
            int[][] dp=new int[n][sum+1];
            for(int i=0;i<n;i++){
                Arrays.fill(dp[i],-1);
            }
            return helper(0,0,nums,target,dp);
        }
        boolean helper(int i, int sum, int[] nums, int target, int[][] dp){
            if(i==nums.length)return false;
            if(sum==target)return true;
            if(dp[i][sum]!=-1)return dp[i][sum]==1;
            boolean skip=helper(i+1, sum, nums, target, dp);
            boolean take=helper(i+1, sum+nums[i], nums, target, dp);
            dp[i][sum] = (take || skip) ? 1 : 0;
            return take||skip;
        }
    }

//    For this question we can't apply the two-pointer approach because, in the two-pointer approach, we have to find out the contiguous array, which is the subsequence of the array. We can't do it with a subset because for a subset we need knapsack.
//      This is a trial of the 2.0 approach but it is giving me an error because, in the 2.0 approach, we can't tackle the subset approach. For the subset we really need maps or deep. In 2.0 there will be a contiguous memory array of that array. That's why we can't do it.

//    class Solution {
//    public boolean canPartition(int[] nums) {
//        int sum=0;
//        int n=nums.length;
//        for(int ele:nums)sum+=ele;
//        if(sum%2!=0)return false;
//        int target=sum/2;
//        int left=0;
//        sum=0;
//        for(int right=0; right<n; right++){
//            sum+=nums[right];
//
//                while(sum>target && left <= right){
//                    sum-=nums[left];
//                    left++;
//                }
//                right=left;
//
//             if(sum==target)return true;
//        }
//        return false;
//    }
//}

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
        Boolean find(int[] arr, int target, int i, int[][] dp){
            if(target==0)return true;
            if(i==arr.length)return false;
            if(dp[i][target]!=-1)return dp[i][target]==1;
            boolean skip=find(arr,target,i+1,dp);
            if(target<arr[i]){
                dp[i][target] = skip ? 1 : 0;
                return skip;
            }
            boolean take=find(arr,target-arr[i],i+1,dp);
            dp[i][target] = (take || skip) ? 1 : 0;
            return take||skip;
        }
    }

}
