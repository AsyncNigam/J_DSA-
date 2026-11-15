package Leetcode_75;

public class q9_move_zeros {
    class Solution {
        public void moveZeroes(int[] nums) {
            int non0=0;
            for(int i=0;i<nums.length;i++)  if(nums[i]!=0) nums[non0++]=nums[i];
            while(non0<nums.length)nums[non0++]=0;
        }
    }
}
