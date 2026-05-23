package A_Practice;

//https://leetcode.com/problems/max-consecutive-ones/description/

public class q7_max_consecutive_ones {
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int c=0;
            int max_c=0;
            for(int el:nums){
                if(el==1){
                    c++;
                    max_c=Math.max(max_c,c);
                }
                else c=0;
            }
            return max_c;
        }
    }
}
