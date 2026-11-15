package Leetcode_75;

public class q13_maximum_average_subarray1 {
    class Solution {
        public double findMaxAverage(int[] nums, int k) {
            int left=0;
            int n=nums.length;
            double sum=0;
            double max_avg=Integer.MIN_VALUE;
            for(int right=0;right<n;right++){
                sum+=nums[right];
                if((right-left+1)>k){
                    sum-=nums[left++];
                }
                if(right-left+1==k){
                    max_avg=Math.max(max_avg, sum/(right-left+1));
                }
            }
            return max_avg;
        }
    }
}
