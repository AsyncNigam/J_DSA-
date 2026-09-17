package Bit_manipulation;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/subsets/
public class q9_subsets {
    class Solution {
        // Function to generate all subsets (power set) of the input array
        public List<List<Integer>> getPowerSet(int[] nums) {
            // Get the size of the input array
            int n = nums.length;

            // Calculate the total number of subsets (2^n)
            int subsets = 1 << n;

            // List to store all subsets
            List<List<Integer>> ans = new ArrayList<>();

            // Iterate through all numbers from 0 to 2^n - 1
            for (int num = 0; num < subsets; num++) {
                // Temporary list to hold current subset
                List<Integer> subset = new ArrayList<>();

                // Iterate through each bit of the number
                for (int i = 0; i < n; i++) {
                    // If ith bit is set, include nums[i] in the subset
                    if ((num & (1 << i)) != 0) {
                        subset.add(nums[i]);
                    }
                }

                // Add this subset into the final result
                ans.add(subset);
            }

            // Return all subsets
            return ans;
        }
    }
}
