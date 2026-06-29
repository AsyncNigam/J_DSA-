package A_Practice;

import java.util.Arrays;

public class q12_leetcode_contest_508_maximum_total_sum_of_k_selected_elements {
    class Solution {
        public long maxSum(int[] nums, int k, int mul) {
            Arrays.sort(nums);
            long sum=0l;
            int n=nums.length-1;
            for(int i=0;i<k;i++){
                if(mul!=0){
                    sum+=(long)nums[n--]*mul--;
                }
                else sum+=nums[n--];
            }
            return sum;
        }
    }
}
