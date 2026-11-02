package Sliding_window;

public class q4_max_consecutive_ones_3 {
    class Solution {
        public int longestOnes(int[] nums, int k) {
            int i=0;
            int j=0;
            int n=nums.length;
            int zero=0;
            int max_len=0;
            while(j<n){
                if(nums[j]==0)zero++;
                while(zero>k){
                    if(nums[i]==0)zero--;
                    i++;
                }
                max_len=Math.max(max_len,j-i+1);
                j++;
            }
            return max_len;
        }
    }
}
