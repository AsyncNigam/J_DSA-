package Zeus_stroke.q5_hashmap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class q6_k_diff_pairs_in_an_array {

//    brute force approach is O(n^2)
    class Solution {
        public int findPairs(int[] nums, int k) {
            int n=nums.length;
            HashSet<List<Integer>> set=new HashSet<>();
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if(Math.abs(nums[i]-nums[j])==k){
                        int min=Math.min(nums[i], nums[j]);
                        int max=Math.max(nums[i], nums[j]);
                        set.add(Arrays.asList(min, max));
                    }
                }
            }
            return set.size();
        }
    }
}
