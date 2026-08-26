package Zeus_stroke.q8_prefix_sum;

public class q1_find_pivot_index {
//    https://leetcode.com/problems/find-pivot-index/?envType=study-plan-v2&envId=leetcode-75

    class Solution {
        public int pivotIndex(int[] nums) {
            int sum=0;
            for(int el:nums)sum+=el;

            int pre=0;
            for(int i=0;i<nums.length;i++){
                if(pre==sum-nums[i])return i;
                pre+=nums[i];
                sum-=nums[i];
            }
            return -1;
        }
    }
}
