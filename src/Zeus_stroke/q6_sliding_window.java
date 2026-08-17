package Zeus_stroke;

public class q6_sliding_window {
    class Solution {
        public int maxSubArray(int[] nums) {
            int sum=nums[0];
            int curr_sum=0;
            for(int el:nums){
                curr_sum+=el;
                sum=Math.max(sum,curr_sum);
                if(curr_sum<0)curr_sum=0;
            }
            return sum;
        }
    }
}
