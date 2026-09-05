package Zeus_stroke.q6_sliding_window;

import java.util.Arrays;
//https://leetcode.com/problems/minimum-removals-to-balance-array/

public class q3_minimum_removals_to_balance_an_array {
    class Solution {
        public int minRemoval(int[] nums, int k) {
            Arrays.sort(nums); // now sorted the array

            int n=nums.length;
            int j=0;
            int maxWindow=0;
            for(int i=0;i<n;i++){  // i will be like the minmum and j be the maximum one
                while(j<n && nums[j]<=(long)k*nums[i])j++;
                maxWindow=Math.max(maxWindow, j-i); // length of the valid part which sphould remain in the array
            }

            return n-maxWindow; // npw substracting the valid length from total will be the removal needed
        }
    }
}
