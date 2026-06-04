package HashMaps_And_sets;

import java.util.HashSet;
// https://leetcode.com/problems/k-diff-pairs-in-an-array/
public class q4_k_difference_pairs_in_array {
    class Solution {
        public int findPairs(int[] nums, int k) {
            HashSet<Integer> set=new HashSet<>();
            HashSet<Integer> uniquePairs = new HashSet<>();
            for(int el:nums){
//                if the bigger one present then add
                if(set.contains(k+el))uniquePairs.add(el);
//                if smaller one present then add , small =el-k
                if(set.contains(el-k))uniquePairs.add(el-k);
                set.add(el);
            }
            return uniquePairs.size();
        }
    }
}
