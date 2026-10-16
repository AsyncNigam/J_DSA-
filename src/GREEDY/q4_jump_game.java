package GREEDY;
//https://leetcode.com/problems/jump-game/
public class q4_jump_game {
    class Solution {
        public boolean canJump(int[] nums) {
            int max_reach=0;
            for(int i=0;i<nums.length;i++){
                if(i>max_reach)return false;
                max_reach=Math.max(max_reach, i+nums[i]);
                if(max_reach>=nums.length-1)return true;

            }
            return false;

        }
    }
}
