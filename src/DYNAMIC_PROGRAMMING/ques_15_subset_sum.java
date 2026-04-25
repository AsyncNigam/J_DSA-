package DYNAMIC_PROGRAMMING;

import java.util.Arrays;

public class ques_15_subset_sum {

//https://www.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1

//    basic recursive approach
//    class Solution {
//        static Boolean isSubsetSum(int arr[], int sum){
//            return find(arr,sum,0);
//        }
//        static  Boolean find(int arr[],int sum,int i){
//            if(sum==0)return true;
//            if(i==arr.length)return false;
//            boolean skip=find(arr,sum,i+1);
//            //  if(sum-arr[i]<0)return skip;//only for +ve inputs
//            boolean take=find(arr,sum-arr[i],i+1);
//            return take||skip;
//        }
//    }

//    by memoization
class Solution {
    static Boolean isSubsetSum(int arr[], int sum){
        int n= arr.length;
//        i is varying from 0 to n-1, sum from sum to 0
        int[][] dp=new int[n][sum+1];
//      here there will be conflict during returning the dp[i][sum] , also we can not take dp as boolean array because in boolean there will be 2 options true or false , then how can we store a unique answer -1

//        in java we can not
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return find(arr,sum,0,dp);
    }
    static  Boolean find(int[] arr, int sum, int i, int[][] dp){
        if(sum==0)return true;
        if(i==arr.length)return false;
        if(dp[i][sum]!=-1)return dp[i][sum]==1;
        boolean skip=find(arr,sum,i+1,dp);
        if(sum<arr[i]){
            dp[i][sum] = skip ? 1 : 0;
            return skip;
        }    //only for +ve inputs
        boolean take=find(arr,sum-arr[i],i+1,dp);
        dp[i][sum] = (take || skip) ? 1 : 0;
        return take||skip;
    }
}
}
