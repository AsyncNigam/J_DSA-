package HashMaps_And_sets.HashSets_TreeSets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//https://leetcode.com/problems/find-missing-elements/
public class q5_find_missing_elements_leetcode { // time complexity O(n)
    class Solution {
        public List<Integer> findMissingElements(int[] nums) {
            HashSet<Integer> set=new HashSet<>();
            ArrayList<Integer> ans=new ArrayList<>();

            // Step 1: Find min and max
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int num : nums) {
                min = Math.min(min, num);
                max = Math.max(max, num);
            }

//            step 2 add all element to hashset
            for(int ele:nums)set.add(ele);
//            step 3 then check and add to list
            for(int i=min;i<=max;i++) // as here we are going from min to max and checking in unordered set so the list will be sorted
                if(!set.contains(i))ans.add(i);
            return ans;
        }
    }
}
