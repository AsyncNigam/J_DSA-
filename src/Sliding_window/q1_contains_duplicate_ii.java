package Sliding_window;

import java.util.HashMap;
import java.util.HashSet;

public class q1_contains_duplicate_ii {
//     this is the brute force approach because here given that i-j <= k, and j can give out of index error if j goes beyond n so another condition j<n

//    Time Complexity: O(n.min(n, k))
//    .Space Complexity: O(1).
//    Trade-offs: High performance overhead. For large arrays where k is also large, this worst-case O(n^2) behavior guarantees a Time Limit Exceeded (TLE) failure. It does not scale.
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

//    by hashmap
//    time O(n) space O(min(n,k))
    class Solution2 {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            HashMap<Integer,Integer> map=new HashMap<>();
            int n=nums.length;
            for(int i=0;i<n;i++){
                if(map.containsKey(nums[i]) && (i-map.get(nums[i]))<=k)return true;
                map.put(nums[i],i);
            }
            return false;
        }
    }

    // if you want to use only hashset and by keeping the size of the hashset less than k
    class Solution3 {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            HashSet<Integer> set=new HashSet<>();
            for(int i=0;i<nums.length;i++){
                if(set.contains(nums[i]))return true;
                set.add(nums[i]);
                if(set.size()>k)set.remove(nums[i-k]);
            }
            return false;
        }
    }

}
