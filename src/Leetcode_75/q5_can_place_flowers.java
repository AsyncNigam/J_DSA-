package Leetcode_75;

public class q5_can_place_flowers {
    class Solution {
        public boolean canPlaceFlowers(int[] nums, int n) {
            int count=0;
            for(int i=0;i<nums.length;i++){
                int left=(i==0) ? 0 :nums[i-1];
                int right=(i==nums.length-1)?0:nums[i+1];
                if(left==0 && nums[i]==0 && right==0){
                    nums[i]=1;
                    count++;
                }
            }
            return count>=n;
        }
    }
}
