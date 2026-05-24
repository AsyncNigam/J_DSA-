package A_Practice;

//here in question we can jump using the element at the specific index with jumping capacity from 0 to that element like we can use maximum jump of that element or below that element at that point
//https://leetcode.com/problems/jump-game/

public class q9_jump_game {
    class Solution {
        public boolean canJump(int[] nums) {
            int max_reach=0; // we are storing the max_reach
            for(int i=0;i<nums.length;i++){
                if(i>max_reach)return false;  //if we can not reach that position even return false
                max_reach=Math.max(max_reach, i+nums[i]); //store in max reach
                if(max_reach>=nums.length-1)return true;  // check do we have reach the end element of nums
            }
            return false;

        }
    }
}
