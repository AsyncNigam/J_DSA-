package A_Practice;

//https://leetcode.com/problems/can-place-flowers/description/

// here you have to manually go and check each because if you just count and predict incase of odd how you can predict that wheather it will be starting like 1 or 0 , according to that how can you give formula of len/2-1 or +1 ,even if starting are empty but the sequence is likely this then how will you predict . so you have to individually check .
public class q1_can_place_flowers {
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
