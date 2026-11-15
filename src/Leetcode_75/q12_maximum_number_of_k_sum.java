package Leetcode_75;

import java.util.HashMap;
//This question is likely two sum  but it is with a count variable. We are not using the `hashmap because we are complex with the duplicate elements. That's why we are using `hashset.
public class q12_maximum_number_of_k_sum {
    class Solution {
        public int maxOperations(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int count = 0;

            for (int ele : nums) {
                int complement = k - ele;
                if (map.getOrDefault(complement, 0) > 0) {
                    count++;
                    map.put(complement, map.get(complement) - 1);
                } else {
                    map.put(ele, map.getOrDefault(ele, 0) + 1);
                }
            }

            return count;
        }
    }
}
