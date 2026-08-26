package Zeus_stroke.q6_sliding_window;

//https://leetcode.com/problems/maximum-average-subarray-i/?envType=study-plan-v2&envId=leetcode-75

public class maximum_average_subarray {
    class Solution {
        public double findMaxAverage(int[] nums, int k) {
            double max_avg=Integer.MIN_VALUE;  // keep this integer minimum value because the array can contain -ve integers
            int left=0;
            double sum=0;
            for(int right=0;right<nums.length;right++){sum+=nums[right];

                while(right-left+1 > k){
                    sum-=nums[left];
                    left++;
                }

                // keep this after the while loop because after shrinking the window also there is a possiblity that the right-left+1 may equals with k
                if(right-left+1 == k){
                    max_avg=Math.max(max_avg, sum/(right-left+1));
                }
            }
            return max_avg;

        }
    }
}
