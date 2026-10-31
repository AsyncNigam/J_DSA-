package Sliding_window;

public class q1_contains_duplicate_ii {
//     this is the brute force approach because here given that i-j <= k, and j can give out of index error if j goes beyond n so another condition j<n
    class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            int n=nums.length;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<=i+k && j<n ;j++){
                    if(nums[i]==nums[j])return true;
                }
            }
            return false;
        }
    }
}
