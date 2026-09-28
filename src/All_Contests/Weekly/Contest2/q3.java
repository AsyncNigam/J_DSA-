package All_Contests.Weekly.Contest2;

import java.util.HashMap;

//https://leetcode.com/problems/longest-subarray-with-restricted-pair-sums/description/

public class q3 {
    class Solution {

        public int longestSubarray(int[] nums) {

            HashMap<Integer, Integer> freq = new HashMap<>();
            HashMap<Integer, Integer> pair = new HashMap<>();

            int i = 0;
            int ans = 0;

            for (int j = 0; j < nums.length; j++) {

                int x = nums[j];

                // If some two elements already have sum x,
                // adding x would make the window invalid.
                while (pair.containsKey(x)) {

                    int remove = nums[i];

                    // Remove this element from frequency first
                    freq.put(remove, freq.get(remove) - 1);

                    if (freq.get(remove) == 0) {
                        freq.remove(remove);
                    }

                    // Remove all pair sums involving 'remove'
                    for (int value : freq.keySet()) {

                        int sum = remove + value;
                        int count = freq.get(value);

                        pair.put(sum, pair.get(sum) - count);

                        if (pair.get(sum) == 0) {
                            pair.remove(sum);
                        }
                    }

                    i++;
                }

                // Add x and create its pairs with existing elements
                for (int value : freq.keySet()) {

                    int sum = x + value;
                    int count = freq.get(value);

                    pair.put(
                            sum,
                            pair.getOrDefault(sum, 0) + count
                    );
                }

                freq.put(x, freq.getOrDefault(x, 0) + 1);

                ans = Math.max(ans, j - i + 1);
            }

            return ans;
        }
    }
}
