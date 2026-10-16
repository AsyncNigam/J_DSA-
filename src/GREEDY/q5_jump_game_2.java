package GREEDY;

import java.util.Arrays;

public class q5_jump_game_2 {
//    normal recursive approach it wil give tle coz tc=O(n^n), sc=O(n)
        class Solution1 {
            public int jump(int[] nums) {
                return helper(0,nums,0);
            }
            int helper(int idx, int[] nums, int jumps){
                if(idx >= nums.length-1)return jumps;
                int min=Integer.MAX_VALUE;
                for(int i=1;i<=nums[idx];i++){
                    min=Math.min(min,helper(idx+i,nums,jumps+1));
                }
                return min;
            }
        }


//        by dp memoization tc is O(n^2) sc is O(n)
        class Solution2 {
        public int jump(int[] nums) {
            int[] dp = new int[nums.length];
            Arrays.fill(dp, -1); // -1 marks uncalculated states
            return helper(0, nums, dp);
        }

        int helper(int idx, int[] nums, int[] dp) {
            // Base case: 0 jumps needed if we are already at or past the last index
            if (idx >= nums.length - 1) return 0;

            // Return cached result if already computed
            if (dp[idx] != -1) return dp[idx];

            // Use a large constant to avoid Integer.MAX_VALUE overflow when adding 1 below
            int minJumps = 100000;

            for (int i = 1; i <= nums[idx]; i++) {
                // Jumps from current idx = 1 + minimum jumps from the next idx
                minJumps = Math.min(minJumps, 1 + helper(idx + i, nums, dp));
            }

            // Cache and return the minimum found
            return dp[idx] = minJumps;
        }
    }

//    by greedy approach here tc is O(n) and sc is O(1)
class Solution {
    public int jump(int[] nums) {
        int jumps=0, l=0, r=0, n=nums.length;
        while(r<n-1){
            int farthest=0;
            for(int idx=l;idx<=r;idx++){
                farthest=Math.max(farthest, idx+nums[idx]);
            }
            l=r+1;
            r=farthest;
            jumps++;
        }
        return jumps;
    }
}


}
