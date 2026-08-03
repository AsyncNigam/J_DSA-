package Zeus_stroke;

public class q7_range_sum_query {

// leetcode link

//  https://leetcode.com/problems/range-sum-query-immutable/description/

//    brute force approach
    class NumArray {
        private int[] prefixSums;

        public NumArray(int[] nums) {
            // Allocate size N + 1 to handle the left boundary cleanly without conditional checks.
            prefixSums = new int[nums.length + 1];
            for (int i = 0; i < nums.length; i++) {
                prefixSums[i + 1] = prefixSums[i] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            return prefixSums[right + 1] - prefixSums[left];
        }
    }
}
