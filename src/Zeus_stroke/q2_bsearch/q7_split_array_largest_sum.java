package Zeus_stroke.q2_bsearch;
//https://leetcode.com/problems/split-array-largest-sum/description/
public class q7_split_array_largest_sum {
    class Solution {
        public int splitArray(int[] nums, int k) {
            int low = 0;
            int high = 0;

            for (int num : nums) {
                low = Math.max(low, num); // Max element is the lower bound
                high += num;              // Sum of all elements is the upper bound
            }

            int ans = high;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (canSplit(nums, k, mid)) {
                    ans = mid;           // Try to find a smaller maximum sum
                    high = mid - 1;
                } else {
                    low = mid + 1;       // Need a larger sum to fit within k partitions
                }
            }

            return ans;
        }

        private boolean canSplit(int[] nums, int k, int maxSum) {
            int subarrays = 1;
            int currentSum = 0;

            for (int num : nums) {
                if (currentSum + num <= maxSum) {
                    currentSum += num;
                } else {
                    subarrays++;
                    currentSum = num;
                }
            }

            return subarrays <= k;
        }
    }
}
